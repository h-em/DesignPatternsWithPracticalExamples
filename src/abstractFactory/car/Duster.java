package abstractFactory.car;

public class Duster extends Car {
    public Duster(Integer enginePower) {
        super(enginePower);
        System.out.println("Duster!");
    }
}
