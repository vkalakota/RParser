package com.ufj.parser.config;

import com.ufj.parser.util.Environment;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Autowired
    private Environment environment;

    private static final Logger logger = Logger.getLogger(DataSourceConfig.class.getName());

    @Bean(name = "dsUFJ")
    public DataSource UFJDataSource() {

        DriverManagerDataSource edm = new DriverManagerDataSource();
        edm.setUrl(environment.getPropertyValue("spring.ds.ufj.url"));
        edm.setDriverClassName(environment.getPropertyValue("spring.ds.ufj.driver.class.name"));
        edm.setUsername(environment.getPropertyValue("spring.ds.ufj.username"));
        edm.setPassword(environment.getPropertyValue("spring.ds.ufj.password"));
        logger.info("Datasource url:: " + environment.getPropertyValue("spring.ds.ufj.url"));
        logger.info("Datasource user :: " + environment.getPropertyValue("spring.ds.ufj.username"));

        return edm;
    }

    @Bean(name = "jdbcUFJ")
    @Autowired
    public JdbcTemplate edmJdbcTemplate(@Qualifier("dsUFJ") DataSource datasource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(datasource);
        jdbcTemplate.setResultsMapCaseInsensitive(true);
        return jdbcTemplate;
    }
}
