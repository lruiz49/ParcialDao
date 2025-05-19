package eventHandlers;

import events.Event;

public class OrderErrorHandler extends EventHandlerBase{

    private final String type = "orderError";
    
    public boolean canHandle(Event event){
        return event.getType() == type;
    }

    public void handleEvent(){
        //do stuff
    }
    
}
