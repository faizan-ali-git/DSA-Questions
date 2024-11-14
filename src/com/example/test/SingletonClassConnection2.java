package com.example.test;

public class SingletonClassConnection2 {

	private String host;
	private String user;

	 static SingletonClassConnection2 obj;

	private SingletonClassConnection2(String host, String user, int port) {

		this.host = host;
		this.user = user;
		this.port = port;
	}

	
	public static SingletonClassConnection2 getInstance() {

		if (obj != null) {
			return obj;
		}

		obj = new SingletonClassConnection2("adad", "5tet", 434);
		return obj;
	}



	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	private int port;

}
