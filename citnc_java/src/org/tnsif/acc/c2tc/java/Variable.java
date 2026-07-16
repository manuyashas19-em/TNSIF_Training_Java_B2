package org.tnsif.acc.c2tc.java;

public class Variable {
    // Instance variable (belongs to each object)
    int price = 10;

    // Static variable (shared across all objects)
    static String category = "Electronics";

    // Method with a local variable
    void print() {
        String msg = "hello"; // local variable
        System.out.println(msg);
    }

    public static void main(String[] args) {
        // Create an object of Variable class
        Variable v = new Variable();

        // Access instance variable
        System.out.println("Instance variable price: " + v.price);

        // Access static variable
        System.out.println("Static variable category: " + Variable.category);

        // Call method to print local variable
        v.print();
    }
}
