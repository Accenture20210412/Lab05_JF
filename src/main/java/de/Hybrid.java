package de;

public class Hybrid extends CarDecorator{
    public Hybrid(Car tempCar) {
        super(tempCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100000.00;
    }

    @Override
    public String getFeatures() {
        return super.getFeatures() + ", with hybrid engine";
    }
}
