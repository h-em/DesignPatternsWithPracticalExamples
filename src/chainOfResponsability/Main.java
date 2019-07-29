package chainOfResponsability;


public class Main {
    public static void main(String[] args) {
        Request reinbursmentRequest = new Request(RequestType.REINBURSMENT,200);

        Manager manager = new Manager();
        Director director = new Director();
        Vp vp = new Vp();
        CEO ceo = new CEO();

        manager.handleRequest(reinbursmentRequest);

        manager.setSuccesor(director);
        director.setSuccesor(vp);
        vp.setSuccesor(ceo);

        Request confericeRequest = new Request(RequestType.REINBURSMENT,20);
        manager.handleRequest(confericeRequest);

        Request conferenceRequest = new Request(RequestType.CONFERENCE,400);
        manager.handleRequest(conferenceRequest);

        Request purchaseRequest = new Request(RequestType.PURCHASE,700);
        manager.handleRequest(purchaseRequest);

        Request purchaseRequest2 = new Request(RequestType.PURCHASE,7000);
        manager.handleRequest(purchaseRequest2);

    }
}
