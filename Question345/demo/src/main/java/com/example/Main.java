package com.example;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        CategoryDAO dao= context.getBean(CategoryDAO.class);
        
        Category1 c = new Category1("cs","sports");

        dao.insertCategory(c);

        List<Object[]> list=dao.getAveragePrice();

        for(Object[] row:list)
        {
            System.out.println(row[0]+"\t"+row[1]);
        }
        context.close();

    }
}