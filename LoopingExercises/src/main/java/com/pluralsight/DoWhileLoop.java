package com.pluralsight;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Create a new main method and print "I love Java" 5 times again
        // using dowhileloop

        String love2 = " I love Java"; // String value
        int repeat2 = 5; // How many times string gets repeated
        int count2 = 0; // Where string value is going to start

        do {
            System.out.println(love2); // String plus where there the string value start which is zero
            count2++; //
        } while (count2 < repeat2);
    }
}

