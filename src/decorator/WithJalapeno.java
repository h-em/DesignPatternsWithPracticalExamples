package decorator;

public class WithJalapeno extends PizzaDecorator {
    private double jalapenoPrice = 2;
    public WithJalapeno(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        double initialCost = pizza.getCost();
        System.out.print(", with jalapeno: +2ron");
        return initialCost + jalapenoPrice;
    }

}
