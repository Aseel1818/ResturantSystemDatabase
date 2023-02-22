package com.RestaurantSystemDB.RestaurantSystemDB.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Categories implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)

    private Long categoryId ;
    private String categoryName;


    @OneToMany(mappedBy = "category")
    private List<Items> item;



    public Categories() {}


    public Categories(String categoryName  )
    {
        this.categoryName=categoryName;
        this.categoryId=categoryId;


    }

    public long getCategoryID(){
        return  categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId=categoryId;
    }

    public String getCategoryName (){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }









}

