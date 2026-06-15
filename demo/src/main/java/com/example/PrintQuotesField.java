package com.example;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class PrintQuotesField {
    
    @Autowired
    private Quotes quotes;


    public void print(){
        System.out.println("Field injection");

        for(String q:quotes.getQuotes())
        {
            System.out.println(q);
        }
    }

}
