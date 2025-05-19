package src.decorators;

import src.INotification;

public class FormatNotification extends BaseNotificationDecorator {
    
    public FormatNotification(INotification wrapper){
        super(wrapper);
    }

    public void sendNotification(String message){
        super.sendNotification(format(message));
    }

    private String format(String message){
        String newFormat = "Contenido del mensaje: " + message;
        return newFormat;
    }
}