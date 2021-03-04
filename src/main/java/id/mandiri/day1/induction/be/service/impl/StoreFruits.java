package id.mandiri.day1.induction.be.service.impl;

import id.mandiri.day1.induction.be.service.StoreService;


public class StoreFruits implements StoreService {

    String[] fruits = {"Jeruk","Anggur","Salak","Mangga"};
    float price = 5000;
    float stock = 100;
    @Override
    public String[] getNameProduct() {
        return fruits;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public float getStock() {
        return stock;
    }

    @Override
    public float getCalculateAmmout() {
        return price*stock*fruits.length;
    }
}
