package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class PrintQuotesConstructor {

    private Quotes quotes;

    @Autowired
    public PrintQuotesConstructor(@Qualifier("hardworkQuotes") Quotes quotes)
    {
        this.quotes=quotes;
    }

    public void print()
    {
        System.out.println("\n Constructor injection");

        for(String q:quotes.getQuotes())
        {
            System.out.println(quotes);
        }

    }


    
}
