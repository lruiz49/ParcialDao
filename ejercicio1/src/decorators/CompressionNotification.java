package src.decorators;

import src.INotification;

public class CompressionNotification extends BaseNotificationDecorator {
    
    public CompressionNotification(INotification wrapper){
        super(wrapper);
    }

    public void sendNotification(String message){
        super.sendNotification(compress(message));
    }

    private String compress(String message){
        //compress
        System.out.println("File compressed.");
        String compressedMessage = message;
        return compressedMessage;
    }
}
