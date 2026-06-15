package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


import javax.sql.DataSource;


@Configuration
public class AppConfig {

    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName(
            "com.microsoft.sqlserver.jdbc.SQLServerDriver");

        ds.setUrl(
            "jdbc:sqlserver://localhost:1433;databaseName=jpa1;encrypt=true;trustServerCertificate=true");

        ds.setUsername("sa");


        ds.setPassword("Preethi@123");

        return ds;

    }

    @Bean
    public JdbcTemplate jdbcTemplate()
    {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public CategoryDAO categoryDAO()
    {
        CategoryDAOImpl dao = new CategoryDAOImpl();

        dao.setJdbcTemplate(jdbcTemplate());

        return dao;

    }
    
}
