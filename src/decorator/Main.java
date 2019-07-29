package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza margerita = new Margherita();

        Pizza myCustomPizza = new WithParmesan(margerita);
        System.out.println("\nTotal cost: "+myCustomPizza.getCost());

        Pizza myCustomPizza2 = new WithJalapeno(myCustomPizza);
        System.out.println("\nTotal cost: "+ myCustomPizza2.getCost());
    }
}
