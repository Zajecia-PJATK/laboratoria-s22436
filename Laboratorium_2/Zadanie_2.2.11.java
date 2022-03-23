package com.company;

import java.io.*;

class Invoice {
    private String product_numeber, product_description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String product_numeber, String product_description, int quantity, double pricePerItem) {
        this.product_numeber = product_numeber;
        this.product_description = product_description;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double amount(){
        if(quantity > 0 && pricePerItem > 0){
            return quantity * pricePerItem;
        }
        return 0 ;
    }

    public String getProduct_numeber() {
        return product_numeber;
    }

    public void setProduct_numeber(String product_numeber) {
        this.product_numeber = product_numeber;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }
}

public class Main {

    public static void main(String[] args) throws IOError {
        Invoice invoice1 = new Invoice("223", "Some product", 12, 22.2);
        Invoice invoice2 = new Invoice("23", "Some other product", -3, 123);

        System.out.println("Invoice 1 amount: " + invoice1.amount());
        System.out.println("Invoice 2 amount: " + invoice2.amount());
    }
}
