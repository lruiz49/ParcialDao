package eventHandlers;

import events.Event;

public class OrderReturHandler extends EventHandlerBase{

    private final String type = "orderReturn";
    
    public boolean canHandle(Event event){
        return event.getType() == type;
    }

    public void handleEvent(){
        //do stuff
    }
    
}