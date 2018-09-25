package com.ufj.parser.rest.client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

public class Parser {

    public static void main(String[] args) {

        try {
            // Specify filename and compute path
            Path filePath = Paths.get("/Users/vasanth/develop/RParser/src/main/resources/Sample.doc");


            // Open file, encode contents to base64, then decode to UTF-8
            byte[] encoded = Base64.getEncoder().encode(Files.readAllBytes(filePath));
            String base64Str = new String(encoded, "UTF-8");

            // Create connection object, based on the given url-name
            URL url = new URL("https://rest.resumeparsing.com/v9/parser/resume");
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
            connection.setRequestProperty("Sovren-AccountId", "55433887");
            connection.setRequestProperty("Sovren-ServiceKey", "6NzvycrJQr2iqOma7fwoikEDMcD2NBRRDQniRBvE");

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
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

// (Optional) Output response details
            System.out.println(responseCode);
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
