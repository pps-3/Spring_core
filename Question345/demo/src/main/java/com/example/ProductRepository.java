package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository
        extends JpaRepository<Product,Integer>{

    @Query("""
           select p.pname,
                  p.category.description
           from Product p
           where length(p.pname) < 10
           and p.price > ?1
           """)
    List<Object[]> getProducts(double price);
}