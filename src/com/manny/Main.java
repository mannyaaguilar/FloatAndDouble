package com.manny;

public class Main {

    public static void main(String[] args) {
	// floating point numbers are numbers that have a decimal point.
        //width of int = 32 (4 bytes).
        int myIntValue = 5 / 3;
        //width of a float = 32 (4 bytes).
        float myFloatValue = 5f / 3f;
        //width of a double = 64 (8 bytes).
        //Three reasons to use double -
        // 1. Faster on modern computers
        // 2. The built-in functions in Java usually use a double
        // 3. Double is far more precise (16 units of precision)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //Challenge: Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable
        // 3. Print the result
        //
        //Note: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
        // Google shows 90.7185
        double pi = 3.141_592_7d;
        System.out.println(pi);





    }
}
