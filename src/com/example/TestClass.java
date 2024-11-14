package com.example;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {

		List<List<String>> items = new ArrayList<List<String>>();
		
		
//		items.add(new ArrayList<String>());
//		items.add(new ArrayList<String>());
		
		List<String> l= new ArrayList<String>();
		l.add("phone");
		l.add("blue");
		l.add("pixel");
		//l.add("xyz");
	//	items.add(l);
		List<String> l2= new ArrayList<>();
		l2.add("computer");
		l2.add("silver");
		l2.add("lenovo");
		//l2.add("xyopz");
		items.add(l);
		items.add(l2);
		System.out.println(items);
		System.out.println(countMatches(items, "color", "silver"));
		
//		items.add(l2);
//		System.out.println(items);
//		for(List<String> i:items) {
//			System.out.println(i.get(0));
//		}
		
		
	}
public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int index,count=0;
        if(ruleKey =="type")
            index=0;
        else if(ruleKey =="color")
            index=1;
        else
            index=2;
        
        for(List<?> l: items){
        
            if(l.get(index)==ruleValue){
                System.out.println(l.get(index));
                count++;
            }
            
        }
        return count;
    }
int[] r() {
	return new int[]{2,6};
}
}
