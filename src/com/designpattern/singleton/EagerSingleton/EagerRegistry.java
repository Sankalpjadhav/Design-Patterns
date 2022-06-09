package com.designpattern.singleton.EagerSingleton;
/**
 * This class uses eager initialization of singleton instance.
 */
public class EagerRegistry {
	// Constructor is defined as private because we don't want child classes override this constructor.
	private EagerRegistry() {
		
	}
	// final : Only one instance that's it
	private static final EagerRegistry INSTANCE = new EagerRegistry();
	// Client can get instance using below method
	public static EagerRegistry getInstance() {
		return INSTANCE;
	}
}