package com.example.test;
class Animal {
    private void privateMethod() { System.out.println("Animal's private method"); }
    static void staticMethod() { System.out.println("Animal's static method"); }
}

class Dog extends Animal {
    private void privateMethod() { System.out.println("Dog's private method"); }
    static void staticMethod() { System.out.println("Dog's static method"); }
}

public class StaticBindingExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.staticMethod();     // Calls Animal's static method (static binding)
      //   animal.privateMethod();  // This line would cause a compile-time error
    }
}
