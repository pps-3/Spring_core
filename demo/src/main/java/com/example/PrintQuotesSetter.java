package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintQuotesSetter {
    

    private Quotes quotes;

    @Autowired
    public void setQuotes(Quotes quotes)
    {
        this.quotes=quotes;
    }

    public void print()
    {
        System.out.println("Setter Constructor");

        for(String q:quotes.getQuotes())
        {
            System.out.println(q);
        }
    }

}
