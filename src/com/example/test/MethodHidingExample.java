package com.example.test;
class Animal2 {
	int i=8;
    static void sound() {
        System.out.println("Animal sound");
    }
    private void walk() {
    	System.out.println("Animal walk");
    }
}

class Dog2 extends Animal2 {
	//int i=9;
    static void sound() {
        System.out.println("Dog barks");
    }
    private void walk() {
    	System.out.println("Dog walk");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        Animal2 dogAsAnimal = new Dog2();
        Dog2 dog = new Dog2();
                System.out.println(dogAsAnimal.i );
        System.out.println(dog.i );
        animal.sound();       // Output: Animal sound
        dogAsAnimal.sound();  // Output: Animal sound, not Dog barks
//        dogAsAnimal.walk();  // Output: Animal sound, not Dog barks
//        animal.walk();       // Output: Animal sound
        dog.sound();  // Output: Animal sound, not Dog barks
    }
    @Override
    public void finalize() {
    	System.out.println("finalize");
    	} 

}