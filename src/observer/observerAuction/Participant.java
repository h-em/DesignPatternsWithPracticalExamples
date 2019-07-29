package observer.observerAuction;

public class Participant extends Observator{

    public Participant(String name) {
        super(name);
    }

    @Override
    public void update(Bid bid) {
        //this should be called when the subject change their state
        System.out.println(name+ ": New bid for " + bid.getNameOfItem() +
                " with value: " + bid.getValue());
    }
}
