package chainOfResponsability;

public class CEO extends Handler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("Ceo can approve it!");
    }
}
