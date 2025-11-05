package com.pluralsight.finance;

public class Jewelery extends FixedAsset{
    private double karot;

    public double getKarot() {
        return karot;
    }

    public void setKarot(double karot) {
        this.karot = karot;
    }

    public Jewelery(String name, double marketValue, double karot) {
        super(name, marketValue);
        this.karot = karot;
    }

    @Override
    public double getMarketValue(){
        return karot * 1000;
    }
}
