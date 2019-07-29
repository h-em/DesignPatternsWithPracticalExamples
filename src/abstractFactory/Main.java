package abstractFactory;

import abstractFactory.car.Car;

public class Main {

    public static void main(String[] args) {

        CarDealer dealer = new CarDealer();
        Car car1 = dealer.deliverCar(20000.d,2000);
        Car car2 = dealer.deliverCar(10000.d,1200);
    }
}
