package events;

import java.util.EventObject;

class MyEventArgs extends EventObject{
    String msg;
    
    public MyEventArgs(Object source, String msg) {
        super(source);
        this.msg = msg;
    }
    

    
    
}
