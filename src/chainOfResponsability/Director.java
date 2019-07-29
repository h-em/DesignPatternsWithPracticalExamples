package chainOfResponsability;

public class Director extends Handler {
    @Override
    public void handleRequest(Request request) {
        if(request.getType() == RequestType.CONFERENCE){
                System.out.println("Director can approve conferinces!");
        }else{
            //send the request higher
            succesor.handleRequest(request);
        }
    }
}
