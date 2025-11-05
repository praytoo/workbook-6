package com.pluralsight.finance;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFt;
    private int bedRms;

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFt() {
        return squareFt;
    }

    public void setSquareFt(int squareFt) {
        this.squareFt = squareFt;
    }

    public int getBedRms() {
        return bedRms;
    }

    public void setBedRms(int bedRms) {
        this.bedRms = bedRms;
    }

    public House(String name, double marketValue, int yearBuilt, int squareFt, int bedRms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFt = squareFt;
        this.bedRms = bedRms;
    }

    @Override
    public double getMarketValue(){
        double price = squareFt * 1000;
        return price;
    }
}
