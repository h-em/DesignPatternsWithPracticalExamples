package decorator;

public class VeganPizza implements Pizza {
    @Override
    public double getCost() {
        System.out.print("Vegan pizza: 20ron");
        return 20;
    }
}
