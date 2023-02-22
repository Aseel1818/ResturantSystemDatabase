package com.RestaurantSystemDB.RestaurantSystemDB.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
public class OrderDetails implements Serializable {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(nullable = false,updatable = false)

        private Long orderDetailsId ;
        private String currency;

        private int quantity;

        private String noteForMenu;

        @ManyToOne
        @JoinColumn(name="order_id")
        private Orders orders;


        @ManyToMany(mappedBy = "orderDetails")
        private Set<Items> items;


        public OrderDetails() {}


        public OrderDetails(int quantity, String noteForMenu, String  currency )
        {
            this.orderDetailsId=orderDetailsId;
            this.noteForMenu=noteForMenu;
            this.quantity=quantity;
            this.currency=currency;



        }
        public long getOrderDetailId(){
            return  orderDetailsId;
        }
        public void setOrderDetailId(long orderDetailsId){
            this.orderDetailsId=orderDetailsId;
        }

        public String getNoteForMenu(){
            return  noteForMenu;
        }
        public void setNoteForMenu(String noteForMenu){
            this.noteForMenu=noteForMenu;
        }

        public String getCurrency(){
            return  currency;
        }
        public void setCurrency(String currency){
            this.currency=currency;
        }


        public int getQuantity(){
            return  quantity;
        }
        public void setQuantity(int quantity){
            this.quantity=quantity;
        }


}

