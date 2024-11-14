package com.example.test;
class Demo {

    // Static variable
    static int staticVar;// = initializeStaticVar();

 // Instance initialization block
    {
        System.out.println("Instance initialization block");
    }
    // Instance variable
    int instanceVar;// = initializeInstanceVar();

    // Static block
    static {
        System.out.println("Static block");
    }

    

    // Constructor
    Demo() {
        System.out.println("Constructor");
    }

    // Static method to initialize static variable
    private static int initializeStaticVar() {
        System.out.println("Static variable initialization");
        return 1;
    }

    // Method to initialize instance variable
    private int initializeInstanceVar() {
        System.out.println("Instance variable initialization");
        return 2;
    }

    // Instance method
    void instanceMethod() {
        System.out.println("Instance method");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
        Demo demo = new Demo();
        //demo.instanceMethod();
    }
}