import eventHandlers.EventHandlerBase;
import events.Event;

public class main {
    public static void main(String[] args) {
        Event event = new Event("newOrder");
        event.addData("items", "lapicer");
        event.addData("payment", "visa");
        event.addData("idCliente", "10");
        event.addData("adress", "pilar");

        EventHandlerBase.findHandler(event);

    }
}
