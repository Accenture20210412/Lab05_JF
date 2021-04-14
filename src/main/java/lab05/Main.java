package lab05;

import de.*;

public class Main {

    public static void main(String[] args) {

        Car simpleCar = new FiatTipo();
        System.out.println(simpleCar.getPrice());
        System.out.println(simpleCar.getFeatures());

        CarDecorator carWithAircondion = new AirCondition(new FiatTipo());
        System.out.println(carWithAircondion.getPrice());
        System.out.println(carWithAircondion.getFeatures());

        CarDecorator fullCar = new AirCondition(new LeatherUpholstering( new Hybrid(new FiatTipo())));
        System.out.println(fullCar.getFeatures());
        System.out.println(fullCar.getPrice());

        CarDecorator fullCar2 = new AirCondition( new Hybrid(new LeatherUpholstering(new FiatTipo())));
        System.out.println(fullCar.getFeatures());
        System.out.println(fullCar.getPrice());

    }
}
