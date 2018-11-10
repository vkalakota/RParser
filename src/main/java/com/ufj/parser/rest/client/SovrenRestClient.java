package com.ufj.parser.rest.client;

import com.ufj.parser.dao.Dao;
import com.ufj.parser.model.sovren.Resume;
import com.ufj.parser.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

@RestController
@RequestMapping("/parse")
public class SovrenRestClient {

    @Autowired
    Service service;


    @RequestMapping(value = "/invoke", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String invoke() {
        System.out.println(" in invoke");


        String resumeStr = service.callParser();
        service.save(resumeStr, "Sovren");

        return "Test";

    }
//    public static void main(String args[]) {
//
//        String resumeStr = callParser();
//
//       // DaoImpl dao = new DaoImpl();
//
//        dao.save(resumeStr, "Sovren");
//
//    }

}
