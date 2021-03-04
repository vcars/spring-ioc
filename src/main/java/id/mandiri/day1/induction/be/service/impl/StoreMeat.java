package id.mandiri.day1.induction.be.service.impl;

import id.mandiri.day1.induction.be.service.StoreService;

public class StoreMeat implements StoreService {
    String[] meat = {"Ayam","Sapi","Kambing","Domba"};
    float price = 100000;
    float stock = 10;
    @Override
    public String[] getNameProduct() {
        return meat;
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
        return price*stock*meat.length;
    }
}
