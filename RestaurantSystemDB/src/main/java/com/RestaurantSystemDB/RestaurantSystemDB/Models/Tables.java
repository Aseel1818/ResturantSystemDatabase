package com.RestaurantSystemDB.RestaurantSystemDB.Models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Tables implements Serializable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)

    private Long tableId ;
    private  boolean tableStatus;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Orders orders;





    public Tables() {}


    public Tables(boolean tableStatus )
    {
        this.tableStatus=tableStatus;
        this.tableId=tableId;


    }

    public long getTableID(){
        return  tableId;
    }
    public void setTableId(Long tableId){
        this.tableId=tableId;
    }

    public boolean getTableStatus (){
        return tableStatus;
    }
    public void setTableStatus(boolean tableStatus){this.tableStatus=tableStatus;}





}
