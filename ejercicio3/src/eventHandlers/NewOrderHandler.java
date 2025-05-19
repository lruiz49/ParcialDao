package eventHandlers;

import events.Event;
import java.util.Map;

public class NewOrderHandler extends EventHandlerBase {
    private final String type = "newOrder";
    
    public boolean canHandle(Event event){
        return event.getType() == type;
    }

    public void handleEvent(Event event){
        System.out.println("New order Recived.\n");

        Map<String,String> data = event.getData();

        System.out.println("Order items:\n" + data.get("items"));

        System.out.println("Payed with " + data.get("payment") );

        System.out.println("Order Sent to " + data.get("idCliente") + " in adress" + data.get("adress"));
    }
}
