package com.jfs.innerclass;

public class InnerClass {
	
	public static void main(String[] args) {
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("From Runnable");
			};
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
	}
}
