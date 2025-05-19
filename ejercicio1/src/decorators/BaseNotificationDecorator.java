package src.decorators;

import src.INotification;

public class BaseNotificationDecorator implements INotification{
    private INotification wrapper;

    public BaseNotificationDecorator(INotification wrapper){
        this.wrapper = wrapper;
    }

    public void sendNotification(String message){
        wrapper.sendNotification(message);
    }
}
