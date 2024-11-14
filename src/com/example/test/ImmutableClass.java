package com.example.test;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {
	
	private final String host;
	private final String user;
	private final int port;
	private final List<String> list;
	
	public ImmutableClass(String host, String user, int port,List<String> list) {

		this.host = host;
		this.user = user;
		this.port = port;
		this.list = new ArrayList<>(list);
	}
	
	public String getHost() {
		return this.host;
	}
	
	public String getUser() {
		return this.user;
	}
	
	public int getPort() {
		return this.port;
	}
	public List<String> getPortList() {
		return new ArrayList<String>(list);
	}

	@Override
	public String toString() {
		return "ImmutableClass [host=" + host + ", user=" + user + ", port=" + port + ", list=" + list + "]";
	}


}
