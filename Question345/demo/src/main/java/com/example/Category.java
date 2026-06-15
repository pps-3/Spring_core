package com.example;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Category {

    @Id
    private String code;
    
    private String description;

    public Category()
    {

    }

    public Category(String code,String description)
    {
        this.code=code;
        this.description=description;
    }

    public void setCode(String code)
    {
        this.code=code;
    }

    public String getCode()
    {
        return code;
    }

    public void setDescription(String description)
    {
        this.description=description;
    }

    public String getDescription()
    {
        return description;
    }


    
}
