package com.ufj.parser.dao.impl;

import com.ufj.parser.dao.Dao;
import com.ufj.parser.model.entity.UFJResume;
import com.ufj.parser.util.Environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("Dao")
public class DaoImpl implements Dao {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DaoImpl.class.getName());

    @Autowired
    @Qualifier("jdbcUFJ")
    private JdbcTemplate ufjJdbcTemplate;
//    @Autowired
//    Environment environment;

    public void save(UFJResume resume){
        System.out.println(" in dao save ");

        String sql = "INSERT INTO resume " +
                "(resumeId) VALUES (?)";


        ufjJdbcTemplate.update(sql, new Object[] { resume.getResumeId()
        });

    }
//
//    public void insert(Customer customer){
//
//        String sql = "INSERT INTO CUSTOMER " +
//                "(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
//
//        jdbcTemplate = new JdbcTemplate(dataSource);
//
//        jdbcTemplate.update(sql, new Object[] { customer.getCustId(),
//                customer.getName(),customer.getAge()
//        });
//
//    }

}
