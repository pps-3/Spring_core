package com.example;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
@Primary
@Scope("singleton")
public class FriendshipQuotes implements Quotes{
    
    @PostConstruct
    public void init()
    {
        System.out.println("frienship qute bean created");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("friendhip qquote bean destroyed");
    }

    @Override
    public List<String> getQuotes()
    {
        return List.of("A friend in need is a friend indeed.",
                "Friendship doubles joy and halves sorrow.",
                "True friends never leave your side.");
    }




}


  
