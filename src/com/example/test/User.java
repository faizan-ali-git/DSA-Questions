package com.example.test;

public class User {
	int id;
	String name;
	int slaray;

	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public User(int id, String name, int slaray) {
		super();
		this.id = id;
		this.name = name;
		this.slaray = slaray;
	}

	public int getSlaray() {
		return slaray;
	}

	public void setSlaray(int slaray) {
		this.slaray = slaray;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this.id == ((User) obj).id && (this.name).equals(((User) obj).name)) {
			return true;
		}

		return false;
	}

}
