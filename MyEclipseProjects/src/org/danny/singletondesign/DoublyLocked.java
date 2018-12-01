package org.danny.singletondesign;

public class DoublyLocked {

	    private static DoublyLocked instance;
	    
	    private DoublyLocked(){}
	    

public static DoublyLocked getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new DoublyLocked();
            }
        }
    }
    return instance;
}
}

