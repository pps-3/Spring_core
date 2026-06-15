package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DisplayQuotes {
    
    @Autowired
    @Qualifier("hardworkQuotes")
    private Quotes quotes;

    public void display()
    {
        System.out.println("this is display quotes");

        for(String q:quotes.getQuotes())
        {
            System.out.println(q);
        }
    }   

}
