package com.ufj.parser.rest.client;

import com.ufj.parser.model.sovren.Resume;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class SovrenRestClient {

    public static void main(String args[]) {
        callParser();
    }

    public static void callParser() {

        {
            try {
                final String uri = "https://rest.resumeparsing.com/v9/parser/resume";

                // Specify filename and compute path
                Path filePath = Paths.get("/Users/vasanth/develop/RParser/src/main/resources/Sample1.doc");


                // Open file, encode contents to base64, then decode to UTF-8
                byte[] encoded = new byte[0];

                encoded = Base64.getEncoder().encode(Files.readAllBytes(filePath));

                String base64Str = new String(encoded, "UTF-8");


//            Map<String, String> params = new HashMap<String, String>();
//            params.put("Content-Type", "application/json");
//            params.put("accept", "application/json");
//            params.put("Sovren-AccountId", "55433887");
//            params.put("Sovren-ServiceKey", "6NzvycrJQr2iqOma7fwoikEDMcD2NBRRDQniRBvE");


                // Construct payload in JSON-format
// (This is a very primitive way to do so, as not to have any external dependencies
//  feel free to use your preferred json-library)
                String payload = "{ \"DocumentAsBase64String\": \"" + base64Str + "\" }";

                //params.put("payload", payload);

                // Create the request body as a MultiValueMap
                MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();

                body.add("payload", payload);

//                HttpHeaders params = new HttpHeaders();
//                params.put("Content-Type", Collections.singletonList("application/json"));
//                params.put("accept", new List("application/json"));
//                params.put("Sovren-AccountId", new List("55433887"));
//                params.put("Sovren-ServiceKey", new List("6NzvycrJQr2iqOma7fwoikEDMcD2NBRRDQniRBvE"));


                MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
                params.put("Content-Type", Collections.singletonList("application/json"));
                params.put("accept", Collections.singletonList("application/json"));
                params.put("Sovren-AccountId", Collections.singletonList("55433887"));
                params.put("Sovren-ServiceKey", Collections.singletonList("6NzvycrJQr2iqOma7fwoikEDMcD2NBRRDQniRBvE"));

                RestTemplate restTemplate = new RestTemplate();
                restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());

                HttpEntity<String> request = new HttpEntity<String>(payload, params);

                //Resume resumeResponse = restTemplate.postForObject(uri, request, Resume.class);
                String resumeResponse = restTemplate.postForObject(uri, request, String.class);


                //requestHeaders.setAuthorization(httpAuthentication);

// Note the body object as first parameter!
                //HttpEntity<?> httpEntity = new HttpEntity<Object>(body, params);
                //RestTemplate restTemplate = new RestTemplate();


                //Resume resumeResponse = restTemplate.exchange(uri, HttpMethod.POST, params, Resume.class);


//            Resume resumeResponse = restTemplate.postForObject(uri, params, Resume.class);

                //System.out.println(resumeResponse);
                System.out.println("tostirng "+resumeResponse.toString());
                //System.out.println("REsume " + resumeResponse.getResumeId());
                //System.out.println("REsume " + resumeResponse.getUserArea());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
