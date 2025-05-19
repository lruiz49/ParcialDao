package eventHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.reflections.Reflections;

import events.Event;

public abstract class EventHandlerBase {

    private static final List<EventHandlerBase> handlers = new ArrayList<>();

    static{
        Reflections reflections = new Reflections("");
        Set<Class<? extends EventHandlerBase>> subTypes = reflections.getSubTypesOf(EventHandlerBase.class);

        for (Class<? extends EventHandlerBase> clazz : subTypes) {
            try {
                handlers.add(clazz.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace(); 
            }
        }
    }

    public void handleEvent(Event event){

        for (EventHandlerBase handler : handlers) {

            if (handler.canHandle(event)) {
                handler.handle(event);
                break;
            }
        }
        throw new RuntimeException("Can't handle event.");
    }

    public boolean canHandle(Event event){
        return false;
    }    

    public void handle(Event event){}
}
