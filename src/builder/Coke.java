package builder;

public class Coke extends ColdDrinks {
    @Override
    public String name() {
        return "Cold Drinks";
    }

    @Override
    public float price() {
        return 20.5f;
    }
}
