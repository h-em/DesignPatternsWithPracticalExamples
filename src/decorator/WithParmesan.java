package decorator;

public class WithParmesan  extends PizzaDecorator{
    private double parmesanPrice = 3;
    public WithParmesan(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double getCost() {
        double initialPrice = pizza.getCost();
        System.out.print(", with parmezan: +3ron");
        return initialPrice + parmesanPrice;
    }


}
