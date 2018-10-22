package com.ufj.parser.service;

import com.ufj.parser.dao.Dao;
import com.ufj.parser.model.entity.UFJResume;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {

    private static final Logger logger = Logger.getLogger(Service.class.getName());

    @Autowired
    Dao dao;


    public void save(UFJResume resume) {
        dao.save(resume);

    }

}
