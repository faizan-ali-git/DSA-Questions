package com.example.test;

import java.util.Comparator;

public class MyComparator implements Comparator<User>{

	

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.getId() -o2.getId();
	//	return 0;
	}
	

}
