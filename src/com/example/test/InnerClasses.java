package com.example.test;

import java.util.Arrays;

public class InnerClasses {

     class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
        public Test() {

        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
       // Test a = new Test();
    	InnerClasses inner = new InnerClasses();
    //	inner.name="";
       // Test b = new Test("Rahul");

        //System.out.println(a);

    //   System.out.println(a.name); 
     
    	//System.out.println(b.name);
    }
}

//static class A {
//
//}