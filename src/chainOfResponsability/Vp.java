package chainOfResponsability;

public class Vp extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.PURCHASE) {
            if (request.getAmount() < 2000) {
                System.out.println("Vp approves!");
            } else {
                succesor.handleRequest(request);
            }
        }
    }
}
