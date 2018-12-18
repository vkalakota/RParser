package com.ufj.parser.service;

import com.ufj.parser.dao.Dao;
import com.ufj.parser.model.entity.UFJResume;
import com.ufj.parser.service.sovren.SovrenParserClient;
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


    public void save(UFJResume resume) {
        dao.save(resume);
    }

    public void save(String resume, String vendor) {
        dao.save(resume, vendor);
    }

    public StringBuffer parse(String filePath) {

        StringBuffer response = sovrenParseClient.consumeService(filePath);
        dao.save(response.toString(), "Sovren");
         
        return response;
    }

}
