package com.example;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;


public class CategoryDAOImpl implements CategoryDAO{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public void insertCategory(Category1 c)
    {
            String sql="insert into category values(?,?)";

            jdbcTemplate.update(sql,c.getCode(),c.getDescription());

            System.out.println("Category Inserted");

    }

    @Override
    public List<Object[]> getAveragePrice()
    {
        String sql=
                    "select catcode,avg(price) from product group by catcode";

        return jdbcTemplate.query(sql,(rs,rowNum)->new Object[]
                                                    {rs.getString(1),
                                                    rs.getString(2)}
                                            );
    }

    
}











