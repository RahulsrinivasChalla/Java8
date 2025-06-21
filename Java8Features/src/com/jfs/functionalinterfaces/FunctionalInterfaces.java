package com.jfs.functionalinterfaces;

@FunctionalInterface
public interface FunctionalInterfaces {
	
	public void apply() ;
	
	default public void log(){
		System.out.println("Log");
	}
	
	public static void info() {
		System.out.println("Info");
	}

}
