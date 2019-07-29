package abstractFactory;

import abstractFactory.car.Car;
import abstractFactory.car.Dacia;
import abstractFactory.car.Duster;
import abstractFactory.car.Sandero;

public class DaciaFactory extends CarFactory{


    public Car createCar(Integer enginePower) {
        switch (enginePower) {
            case 1200:
                return new Sandero(enginePower);
            case 1600:
                return new Dacia(enginePower);
            case 2000:
                return new Duster(enginePower);
            default:
                return null;
        }
    }
}
