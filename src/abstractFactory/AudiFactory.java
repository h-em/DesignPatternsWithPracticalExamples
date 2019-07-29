package abstractFactory;

import abstractFactory.car.*;

public class AudiFactory extends CarFactory{

    public Car createCar(Integer enginePower) {
        switch (enginePower) {
            case 1200:
                return new A1(enginePower);
            case 1600:
                return new A4(enginePower);
            case 2000:
                return new TT(enginePower);
            default:
                return null;
        }
    }
}
