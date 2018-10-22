package org.lm.edm.api.office.dao.impl;

import org.lm.edm.api.office.dao.OfficeProfileDao;
import org.lm.edm.api.office.model.entity.Office;
import org.lm.edm.api.office.model.entity.TeamInfo;
import org.lm.edm.api.office.util.Constants;
import org.lm.edm.api.office.util.OfficeProfileEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by vkalakotahe7160 on 10/01/2018
 * DAO Implementation for Office profile Service
 */
@Repository
@Qualifier("officeProfileDao")
public class OfficeProfileDaoImpl implements OfficeProfileDao {

    private static final org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(OfficeProfileDaoImpl.class.getName());

    @Autowired
    @Qualifier("jdbcEDM")
    private JdbcTemplate edmJdbcTemplate;
    @Autowired
    OfficeProfileEnvironment environment;

    public Office fetchOfficeById(String officeId) throws Exception {
        System.out.println("JDBC template is :: " + edmJdbcTemplate);
        Office office = null;

        logger.info("Fetching office info by ID fetchOfficeById() ");
        List<Office> offices = null;
        try {

            offices = edmJdbcTemplate.query(environment.getPropertyValue(Constants.SQL_FETCH_OFFICE_BYID), new Object[]{officeId},
                    new BeanPropertyRowMapper<>(Office.class));
            logger.info("Returned Office.. fetchOfficeById() ");
            //should return only 1 office
            if (offices != null && offices.size() > 0) {
                office = offices.get(0);
            }
            if (offices != null) {
                logger.info("fetched Office size:: " + offices.size());
            }
        } catch (Exception e) {
            logger.error("Exception in fetchOfficeById() :: ", e);
            throw new Exception(e);
        }

        return office;
    }

    public List<TeamInfo> fetchTeamsByOfficeId(String officeId) throws Exception {
        List<TeamInfo> teams;
        try {
            logger.info("fetching team and products info from database");
            teams = edmJdbcTemplate.query(environment.getPropertyValue(Constants.SQL_FETCH_TEAMINFO_BYOFFICEID), new Object[]{officeId},
                    new BeanPropertyRowMapper<>(TeamInfo.class));
            if (teams != null) {
                logger.info("fetched Teams size :: " + teams.size());
            }

        } catch (Exception e) {
            logger.error("Exception in fetchTeamsByOfficeId() :: ", e);
            throw new Exception(e);
        }
        return teams;
    }

    public boolean isAuthorized(String officeId, String userName) throws Exception{
        boolean isAuthorized = false;



        return  isAuthorized;
    }

}
