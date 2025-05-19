package src;

import java.io.File;
import java.io.IOException;

import src.decorators.BaseNotificationDecorator;
import src.decorators.CompressionNotification;
import src.decorators.EncryptNotification;
import src.decorators.FormatNotification;
import src.decorators.LogNotification;

public class main {
    public static void main(String[] args) {


        //creo archivo logs.txt para guardar los logs

        try {
            File myObj = new File("logs.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } 
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Pruebo con el mismo mensaje con diferentes decoradores a que notifique por Terminal
        //En "encrypt" comprimo la notificacion, luego la encrypto , loggeo el mensaje encryptad y finalmente sale el mensaje encryptado por terminal
        //En "log" simplemente logeo el mensaje y lo mando por terminal
        //en mail formateo el mensaje, lo logeo y simulo que manda un mail
        String message = "Hello World.";

        BaseNotificationDecorator encrypt = new CompressionNotification(new EncryptNotification(new LogNotification(new TerminalNotification())));
        BaseNotificationDecorator log = new FormatNotification(new LogNotification(new TerminalNotification()));
        BaseNotificationDecorator mail = new FormatNotification(new LogNotification(new MailNotification()));

        encrypt.sendNotification(message);
        log.sendNotification(message);
        mail.sendNotification(message);


    }
}
