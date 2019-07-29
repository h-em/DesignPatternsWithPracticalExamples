package observer;

public class Hater extends Person {
    public Hater(String name) {
        super(name);
    }

    @Override
    public void update(Subject subjectWhoTriggered) {
        System.out.println("I am  " + this.name
                + " and I recived an update from "
                + subjectWhoTriggered.getName() + " "
                + subjectWhoTriggered.getLatestPost()
                + " - I hate this!");
    }
}
