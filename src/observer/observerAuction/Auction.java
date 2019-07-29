package observer.observerAuction;

public class Auction {

    public void start(){
        Participant jack = new Participant("Jack");
        Participant john = new Participant("John");

        Item bike = new Item( "bike",  12);

        jack.follow(bike);
        john.follow(bike);


        Bid firstBid = new Bid(10,bike,jack);
        bike.newBid(firstBid);
        Bid anotherBid = new Bid(15,bike,jack);
        bike.newBid(anotherBid);

    }
}
