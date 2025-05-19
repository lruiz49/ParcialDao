package src;

public class MailNotification implements INotification {
    
    public void sendNotification(String message){
        //implementar mail con smtp y todo, por el examen imprimo por consola mail Enivado
        System.out.println("Mail envidado mensaje: " + message);
    }
}
