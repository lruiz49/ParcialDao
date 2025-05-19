package src;

public class TerminalNotification implements INotification  {

    public void sendNotification(String message){
        System.out.println(message);
    }
    
}
