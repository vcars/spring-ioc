package id.mandiri.day1.induction.be.service.impl;

import id.mandiri.day1.induction.be.service.StoreService;

public class StoreVegetables implements StoreService {


    String[] vegetables = {"Terong","Kol","Sawi","Bayam"};
    float price = 3000;
    float stock = 100;
    @Override
    public String[] getNameProduct() {
        return vegetables;
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
        return price*stock*vegetables.length;
    }
}
