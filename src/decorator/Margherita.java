package decorator;

public class Margherita implements Pizza {

    @Override
    public double getCost() {
        System.out.print("Margherita pizza: 15ron");
        return 15;
    }
}
