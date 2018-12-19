package com.ufj.parser.dao.impl;

import com.ufj.parser.dao.Dao;
import com.ufj.parser.model.entity.UFJResume;
import com.ufj.parser.util.Environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@Qualifier("Dao")
public class DaoImpl implements Dao {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DaoImpl.class.getName());

    @Autowired
    @Qualifier("jdbcUFJ")
    private JdbcTemplate ufjJdbcTemplate;

    public void save(UFJResume resume) {
        System.out.println(" in dao save ");

        String sql = "INSERT INTO resume " +
                "(resumeId) VALUES (?)";

        ufjJdbcTemplate.update(sql, new Object[]{resume.getResumeId()
        });

    }

    public void save(String resumeFileName, String parsedResume, String vendor) {
        System.out.println(" in dao save ");

        String sql = "INSERT INTO resume_details " +
                "(resume_filename, parser_name, parser_output) VALUES (?, ?, ?)";
        System.out.println(" in dao values:: " + vendor);

        ufjJdbcTemplate.update(sql, new Object[]{resumeFileName, vendor, parsedResume});

    }
}
