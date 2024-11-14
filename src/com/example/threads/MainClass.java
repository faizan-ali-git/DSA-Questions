package com.example.threads;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(new MyThread("t1"));
		Thread t2 = new Thread(new MyThread("t2"));
		Thread t3 = new Thread(new MyThread("t3"));
		Thread t4 = new Thread(new MyThread("t3"));
		t1.start();
		Thread.sleep(5000);
		t2.start();
		Thread.sleep(5000);
		t3.start();
		Thread.sleep(5000);
		t4.start();
		Thread.sleep(5000);

	}
}
