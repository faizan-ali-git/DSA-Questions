package com.example.threads;

public class ObjectLevelLock {
	
	public static void main(String[] args) {
		ObjectLevelLock obj = new ObjectLevelLock(); 
		ObjectLevelLock obj2 = new ObjectLevelLock(); 
		ThreadClass1 thread1 = new ThreadClass1(obj);
		ThreadClass1 thread2 = new ThreadClass1(obj);
		thread1.start();
		thread2.start();
		
	}
	
	public synchronized void m1() {
		//here the thread1 has the acquired lock on this method that means on the particular 
		//object also.
		//i.e any other thread cannot access the same method with the same object.
		//even the m2() method cannot be accessed by any other thread because it is synchronized and lock is
		//on object 
		
		//let's suppose the thread1 has a lock on m1() and thread2 can access the m2() 
		//method if it is not synchronized.
		System.out.println("In method m1() thread - "+ Thread.currentThread());
	}
	
	public synchronized void m2() {
		System.out.println("In method m2() thread - "+ Thread.currentThread());
	}

}


class ThreadClass1 extends Thread{
	ObjectLevelLock object = null;
	
	public ThreadClass1(ObjectLevelLock object) {
		this.object = object;
	}
	
	@Override
	public void run() {
		object.m1();
		object.m2();

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
