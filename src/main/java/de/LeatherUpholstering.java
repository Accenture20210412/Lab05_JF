package de;

public class LeatherUpholstering extends CarDecorator
{
    public LeatherUpholstering(Car tempCar) {
        super(tempCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 123000;
    }

    @Override
    public String getFeatures() {
        return super.getFeatures() + ", with leather upholstering";
    }
}
