package com.example;

class MyStack{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	  if (top==-1){
	      top=0;
	     arr[top++]=a; 
	      
	  }
	  else
	  arr[top++]=a;
	    // Your code here
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
	    if(top==-1)
	    return top;
	    
	    else
	    return arr[top];

        // Your code here
	}
}
