package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        // Create a while loop to display the text "I Love Java" 5 times
        // Using While Loop

        String love = "I Love Java"; // input String
        int repeatString = 5; // How many times you want to repeat the string
        int count = 0; // starting base of String

        // starting base number of string and the value being less than 5
        while (count < repeatString) {
            System.out.println(love); // printing out "I Love Java" - statement is true
            count ++; // making string statement repeat

        }
    }
}
