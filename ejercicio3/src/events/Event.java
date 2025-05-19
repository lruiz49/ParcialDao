package events;

import java.util.HashMap;
import java.util.Map;

public  class Event {

    private final Map<String, String> data = new HashMap<>();

    private final String type;

    public Event(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void addData(String dataType, String newData){
        data.put(dataType, newData);
    }

    public Map<String, String> getData(){
        return data;
    }

    
} 