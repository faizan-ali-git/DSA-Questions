package com.example.threads;

public class ClassLevelLock {

	public static void main(String[] args) {

		ThreadClass3 thread1 = new ThreadClass3();
		ThreadClass3 thread2 = new ThreadClass3();
		thread1.start();
		thread2.start();

	}

	public static synchronized void m1() {

		System.out.println("In method m1() thread - " + Thread.currentThread());
	}

	public static synchronized void m2() {
		System.out.println("In method m2() thread - " + Thread.currentThread());
	}

}

class ThreadClass3 extends Thread {
	ClassLevelLock obj2=null;

	@Override
	public void run() {
		obj2.m1();
		obj2.m2();

	}
}
//class ThreadClass2 extends Thread{
//	ObjectLevelLock object = null;
//	public ThreadClass2(ObjectLevelLock object) {
//		this.object = object;
//	}
//	
//	@Override
//	public void run() {
//		object.m1();
//		object.m2();
//		
//	}
//}
