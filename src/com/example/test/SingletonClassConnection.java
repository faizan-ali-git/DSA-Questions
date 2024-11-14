package com.example.test;

public class SingletonClassConnection {



	private static SingletonClassConnection obj;



	private SingletonClassConnection() {
	}
	public static synchronized SingletonClassConnection getInstance() {

		if (obj != null) {
			return obj;
		}

		obj = new SingletonClassConnection();
		return obj;
	}


}
