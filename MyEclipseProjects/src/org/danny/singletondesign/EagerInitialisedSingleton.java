package org.danny.singletondesign;

public class EagerInitialisedSingleton {
    
    private static final EagerInitialisedSingleton instance = new EagerInitialisedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitialisedSingleton(){}

    public static EagerInitialisedSingleton getInstance(){
        return instance;
    }
}



