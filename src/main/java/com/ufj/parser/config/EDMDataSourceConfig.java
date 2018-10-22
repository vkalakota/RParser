package org.lm.edm.api.office.config;

import org.apache.log4j.Logger;
import org.lm.edm.api.office.util.OfficeProfileEnvironment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Data source configuration for EDM Office Profile Service
 * Created by vkalakotahe7160 on 10/17/2018
 */
@Configuration
public class EDMDataSourceConfig {

    @Autowired
    private OfficeProfileEnvironment environment;
    private static final Logger logger = Logger.getLogger(EDMDataSourceConfig.class.getName());

    @Bean(name = "dsEDM")
    public DataSource edmDataSource() {

        DriverManagerDataSource edm = new DriverManagerDataSource();
        edm.setUrl(environment.getPropertyValue("spring.ds.edm.url"));
        edm.setDriverClassName(environment.getPropertyValue("spring.ds.edm.driver.class.name"));
        edm.setUsername(environment.getPropertyValue("spring.ds.edm.username"));
        edm.setPassword(environment.getPropertyValue("spring.ds.edm.password"));
        logger.info("Datasource url:: " + environment.getPropertyValue("spring.ds.edm.url"));
        logger.info("Datasource user :: " + environment.getPropertyValue("spring.ds.edm.username"));

        return edm;
    }

    @Bean(name = "jdbcEDM")
    @Autowired
    public JdbcTemplate edmJdbcTemplate(@Qualifier("dsEDM") DataSource datasource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
}
