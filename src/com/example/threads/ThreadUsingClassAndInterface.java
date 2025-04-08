package com.example.threads;

public class ThreadUsingClassAndInterface {

	public static void main(String[] args) {
		MyThreadClass t1 = new MyThreadClass();
		t1.start();
		//MyThreadClassUsingInterface t2 = new MyThreadClassUsingInterface();
		//t2.start(); //not possible because the start method is defined in the Thread class not in the runnable interface
		//so doing like below will work
		Thread t2 = new Thread(new MyThreadClassUsingInterface());
		t2.start();

	}

}

class MyThreadClass extends Thread{
	
	@Override
	public void run() {
		System.out.println("inside run method() " + Thread.currentThread());
	}
	
}

class MyThreadClassUsingInterface implements Runnable{
	
	@Override
	public void run() {
		System.out.println("inside run method() of interface class " + Thread.currentThread());
	}
	
}
