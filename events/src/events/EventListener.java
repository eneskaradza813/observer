package events;

public class EventListener implements MyListener {

   // static EventListener eventListener = new EventListener();
    
    public static void main(String[] args) throws InterruptedException {

        MyClass class1 = new MyClass();
        class1.addMyListeners(new EventListener());
        class1.doSomeWork();
        
    }

    @Override
    public void onJobDone(MyEventArgs event) {
        System.out.println("Message from method: " + event.msg);
    }

}
