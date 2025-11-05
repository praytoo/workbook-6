package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }
    @Override
    public double getMarketValue(){
        return weight * 1000;
    }
}
