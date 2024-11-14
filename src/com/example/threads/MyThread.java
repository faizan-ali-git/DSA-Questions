package com.example.threads;

public class MyThread implements Runnable{

	public String t;
	
	public MyThread(String t) {
		super();
		this.t = t;
	}

	
	public void run() {
		System.out.println( this.t + " Thread started");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.t +" Thread Stoped");
	}

}
