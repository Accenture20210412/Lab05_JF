package de;

public abstract class CarDecorator implements Car{

    private Car tempCar;

    public CarDecorator(Car tempCar) {
        this.tempCar = tempCar;
    }

    @Override
    public double getPrice() {
        return tempCar.getPrice();
    }

    @Override
    public String getFeatures() {
        return tempCar.getFeatures();
    }
}
