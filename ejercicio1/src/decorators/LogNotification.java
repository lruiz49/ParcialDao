package src.decorators;

import java.io.FileWriter;
import java.io.IOException;

import src.INotification;

public class LogNotification extends BaseNotificationDecorator {
    
    public LogNotification(INotification wrapper){
        super(wrapper);
    }

    public void sendNotification(String message){
        super.sendNotification(message);

        try {
            FileWriter myWriter = new FileWriter("logs.txt", true);
            myWriter.write("Message sent. Content:\n" + String.valueOf(message) + "\n\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
