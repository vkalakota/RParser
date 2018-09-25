package com.ufj.parser.rest.client;

import org.springframework.web.client.RestTemplate;

public class SovrenRestClient {

    private static void getEmployees()
    {
        final String uri = "https://rest.resumeparsing.com/v9/parser/resume";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }
}
