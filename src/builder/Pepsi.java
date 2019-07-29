package builder;

public class Pepsi extends ColdDrinks {
    @Override
    public String name() {
        return "Cold Drinks";
    }

    @Override
    public float price() {
        return 15.2f;
    }
}
