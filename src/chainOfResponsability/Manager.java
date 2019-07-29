package chainOfResponsability;

public class Manager extends Handler{
    @Override
    public void handleRequest(Request request) {
        if(request.getType() == RequestType.REINBURSMENT){
            //Manager's areea of aproval
            if(request.getAmount() > 100){
                System.out.println("Manager can approve but rejects it!");
            }else{
                System.out.println("Manager can approve and sign the request!");
            }
        }else{
            //send the request higher
            succesor.handleRequest(request);
        }
    }
}
