package com.example.test;
interface Coffee {
    String getDescription();
    double getCost();
}

class BasicCoffee implements Coffee {
    public String getDescription() {
        return "Basic Coffee";
    }

    public double getCost() {
        return 5.0; // Base price
    }
}

class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee; // Wraps the existing coffee object
    }

    public String getDescription() {
        return coffee.getDescription() + ", Milk"; // Adds milk description
    }

    public double getCost() {
        return coffee.getCost() + 1.5; // Adds milk cost
    }
}

class SugarDecorator implements Coffee {
    private Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee; // Wraps the existing coffee object
    }

    public String getDescription() {
        return coffee.getDescription() + ", Sugar"; // Adds sugar description
    }

    public double getCost() {
        return coffee.getCost() + 0.5; // Adds sugar cost
    }
}

public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee(); // Basic coffee
        coffee = new MilkDecorator(coffee); // Add milk
        coffee = new SugarDecorator(coffee); // Add sugar

        System.out.println(coffee.getDescription()); // Output: Basic Coffee, Milk, Sugar
        System.out.println("Total Cost: $" + coffee.getCost()); // Output: Total Cost: $7.0
    	  String s = "Geeks"; // Original string

          // Object initialized with the string
     
    }
}