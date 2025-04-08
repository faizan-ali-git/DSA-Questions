package com.example.threads;
public class DeadlockExample {
	
	public static void main(String[] args) {
    	DeadlockExample object = new DeadlockExample();
		ThreadClass5 thread1 = new ThreadClass5(object);
		ThreadClass5 thread2 = new ThreadClass5(object);
		thread1.start();
		thread2.start();
	}
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
           System.out.println("method1() lock1 thread - " + Thread.currentThread());
            synchronized (lock2) {
                System.out.println("method2() lock2 thread - " + Thread.currentThread());
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("method2() lock2 thread - " + Thread.currentThread());
            synchronized (lock1) {
                System.out.println("method2() lock1 thread - " + Thread.currentThread());
            }
        }
    }
     
}
class ThreadClass5 extends Thread{
	DeadlockExample object = null;
	
	public ThreadClass5(DeadlockExample object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		object.method1();
		object.method2();

	}
}
