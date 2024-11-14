package com.example;

import java.util.ArrayList;

public class GfgReverseArray {

	    //Function to reverse every sub-array group of size k.
	    public static void main(String[] args) {
	        // code here
	    	ArrayList<Integer> arr= new ArrayList<>();
	    	arr.add(2);
	    	arr.add(3);
	    	arr.add(7);
	    	arr.add(9);
	    	arr.add(13);
	    	arr.add(298);
	    	arr.add(0);
	    	arr.add(-98);
	    	//arr.add(54);
	    	int k=3,n=arr.size();
	        int i=0,j=k-1,temp;
	        while(i<n && j<n)
	        {
	            if(i<j ){
	            temp=arr.get(i);
	          arr.set( i,arr.get(j));
	            arr.set( j,temp);
	            i++;j--;
	            }
	            if(i==j) {
	            	System.out.println("in firdt if"+ i+j);
	            	i=i+ (k/2) +1;
	            	j=i+k-1;
	            	System.out.println( i+ " "+j);

	            }
	            if(i>j) {
	            	System.out.println("in 2ndt if");
	            	i=i+ (k/2);
	            	j=i+k-1;
	            }
	        }
	            if(i<n-1 && j>n-1) {
	            j=n-1;
	            	while(i<n-1)
	            	{
	            		temp=arr.get(i);
	      	          arr.set( i,arr.get(j));
	      	            arr.set( j,temp);
	      	            i++;j--;
	            	}
	            	}
	        
//	        int q=n-1,temp2;
//	        for(int p=k ; p< n ; p++,q--)
//	        {
//	            while(p>q){
//	           temp2=arr.get(p);
//	          arr.set( p,arr.get(q));
//	            arr.set( q,temp2);
//	            }
//	        }
	       // System.out.print(arr.get(3));
	        
	        for (int p:arr)
	        {
	        	System.out.println(p);
	        }
	    }
	
}
