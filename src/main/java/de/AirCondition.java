package de;

public class AirCondition extends CarDecorator{
    public AirCondition(Car tempCar) {
        super(tempCar);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 2000.0;
    }

    @Override
    public String getFeatures() {
        return super.getFeatures() + ", with aircondition";
    }
}
