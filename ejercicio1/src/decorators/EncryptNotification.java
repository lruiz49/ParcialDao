package src.decorators;


import src.INotification;

public class EncryptNotification extends BaseNotificationDecorator {
    
    public EncryptNotification(INotification wrapper){
        super(wrapper);
    }

    public void sendNotification(String message){
        super.sendNotification(encrypt(message));
    }

    private String encrypt(String message){
        byte[] bytes = message.getBytes();
        return bytes.toString();
    }
}
