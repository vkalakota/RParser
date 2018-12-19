package com.ufj.parser.service;

import com.ufj.parser.dao.Dao;
import com.ufj.parser.model.entity.UFJResume;
import com.ufj.parser.service.sovren.SovrenParserClient;
import com.ufj.parser.util.Environment;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParserService {

    private static final Logger logger = Logger.getLogger(Service.class.getName());

    @Autowired
    Dao dao;

    @Autowired
    SovrenParserClient sovrenParseClient;

    @Autowired
    Environment environment;


    public void save(UFJResume resume) {
        dao.save(resume);
    }

    public void save(String resumeFileName, String parsedResumeValue, String vendor) {
        dao.save(resumeFileName, parsedResumeValue, vendor);
    }

    public StringBuffer parse(String fileName) {

        StringBuffer response = sovrenParseClient.consumeService(fileName);
        save(fileName, response.toString(), environment.getPropertyValue("parser.vendor.id"));
         
        return response;
    }



}
