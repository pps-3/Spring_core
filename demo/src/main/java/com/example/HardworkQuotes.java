package com.example;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
@Lazy
@Scope("prototype")
public class HardworkQuotes implements Quotes{


    @PostConstruct
    public void init()
    {
        System.out.println("hardwork qute bean created");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("hardwork qquote bean destroyed");
    }

    @Override
    public List<String> getQuotes()
    {
        return List.of( "Hard work beats talent.",
                "Success comes from dedication.",
                "Dream big and work hard.",
                "Effort today brings success tomorrow.");
    }
  
}
