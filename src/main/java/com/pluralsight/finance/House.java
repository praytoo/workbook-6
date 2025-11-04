package com.pluralsight.finance;

public class House extends FixedAsset{
    private int yearBuilt;
    private int sqaureFt;
    private int bedRms;

    public House(String name, double marketValue, int yearBuilt, int sqaureFt, int bedRms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.sqaureFt = sqaureFt;
        this.bedRms = bedRms;
    }

    public void getMarketValue(){
    }
}
