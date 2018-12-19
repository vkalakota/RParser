package com.ufj.parser.service.sovren;

import com.ufj.parser.util.Environment;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

@Service
public class SovrenParserClient {

    private static final Logger logger = Logger.getLogger(SovrenParserClient.class.getName());

    @Autowired
    private Environment environment;

    public StringBuffer consumeService(String fileName){

        StringBuffer response = new StringBuffer();
        try{
        // Specify filename and compute path
        //Path filePath = Paths.get("C:/develop/RParser/src/main/resources/HAB_S1.doc");
        Path filePath = Paths.get(environment.getPropertyValue("resume.location")+"/"+fileName);

        // Open file, encode contents to base64, then decode to UTF-8
        byte[] encoded = Base64.getEncoder().encode(Files.readAllBytes(filePath));
        String base64Str = new String(encoded, "UTF-8");

        // Create connection object, based on the given url-name
        URL url = new URL(environment.getPropertyValue("sovren.resume.url"));
        HttpURLConnection connection;

        connection = (HttpURLConnection) url.openConnection();

        // Properties in order to ensure successful POST-request
        connection.setUseCaches(false);
        connection.setDoInput(true);
        connection.setDoOutput(true);

        // Specify request-method and headers
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("accept", "application/json");

        // Specify your credentials
        connection.setRequestProperty("Sovren-AccountId", environment.getPropertyValue("sovren.accountid"));
        connection.setRequestProperty("Sovren-ServiceKey", environment.getPropertyValue("sovren.servicekey"));

        // Construct payload in JSON-format
        // (This is a very primitive way to do so, as not to have any external dependencies
        //  feel free to use your preferred json-library)
        String payload = "{ \"DocumentAsBase64String\": \"" + base64Str + "\" }";

        // Send payload
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new DataOutputStream(connection.getOutputStream()), "UTF-8"));
        bw.write(payload);
        bw.flush();
        bw.close();

        // Read response
        int responseCode = connection.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // (Optional) Output response details
      logger.info("Response Code:: "+responseCode);
      logger.info("Parsed Resume Response value from Sovren ::"+response.toString());

    } catch (IOException e) {
            logger.error("Exception consuming Sovren parser ::",e);
        e.printStackTrace();
    }
        return response;
    }

}
