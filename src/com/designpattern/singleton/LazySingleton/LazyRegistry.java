package com.designpattern.singleton.LazySingleton;

/**
 * This class demonstrates singleton pattern using Double Checked Locking or "classic" singleton.
 * This is also a lazy initializing singleton.
 * Although this implementation solves the multi-threading issue with lazy initialization using volatile
 * and double check locking, the volatile keyword is guaranteed to work only after JVMs starting with
 * version 1.5 and later.
 */
public class LazyRegistry {

    private LazyRegistry() {
    	
    }
    
    private static volatile LazyRegistry INSTANCE;
    
    public static LazyRegistry getInstance() {
    	if(INSTANCE == null) {
    		synchronized (LazyRegistry.class) {
				if(INSTANCE == null) {
					INSTANCE = new LazyRegistry();
				}
			}
    	}
    	return INSTANCE;
    }
}
