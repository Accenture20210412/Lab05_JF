package de;

import lombok.Data;

@Data


public class FiatTipo implements Car{
    private String brand = "Fiat";
    private String model = "Tipo";
    private double price = 40000.00;


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getFeatures() {
        return this.brand + " " + this.model;
    }
}
