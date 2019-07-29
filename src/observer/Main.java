package observer;

public class Main {

    public static void main(String[] args) {
        Subject acdc = new RockStar("ACDC");
        Subject ina = new RockStar("INA");
        Subject andra = new RockStar("ANDRA");

        Observator jon = new Person("John");
        Observator mary = new Person("Mary");
        Observator jack = new Hater("Jack");

        jon.follow(acdc);
        jon.follow(ina);
        jon.follow(andra);

        mary.follow(acdc);
        jack.follow(acdc);

        acdc.postNewEvent("New concert in september!");
        ina.postNewEvent("New event tomorow!");
        andra.postNewEvent("Concert la sala palatului!");

        System.out.println();
        RussianSpammer russianSpammer = new RussianSpammer("Ivan");
        russianSpammer.setLatestPost("Vote for Trump!");

        jon.update(russianSpammer);
    }
}
