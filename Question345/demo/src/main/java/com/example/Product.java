package com.example;

import jakarta.persistence.*;

@Entity
public class Product 
{

    @Id
    private int pid;

    private String pname;

    private double price;

    @ManyToOne
    @JoinColumn(name="catcode")
    private Category category;

    public Product() {
    }

    public Product(int pid, String pname,
                   double price,
                   Category category) {

        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.category = category;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}