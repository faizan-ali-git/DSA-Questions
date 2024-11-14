package com.example.dataStructures;
// Java program to demonstrate the
// working of PriorityQueue
import java.util.*;

class PriorityQueueDemo {
  
      // Main Method
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(1);
        pQueue.add(125);
        pQueue.add(78);
        System.out.println(pQueue);
        // Printing the top element of PriorityQueue
        //System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        // Printing the top element again
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
        System.out.println(pQueue.poll());
        System.out.println(pQueue);
    }
}
