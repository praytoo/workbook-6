package com.pluralsight.finance;

public class Jewelery extends FixedAsset{
    private double karot;

    public Jewelery(String name, double marketValue, double karot) {
        super(name, marketValue);
        this.karot = karot;
    }

    public void getMarketValue(){
    }
}
