package com.jeremytrindade;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes).
        int myIntValue = 5 / 2;

        // width of float = 32 (4 bytes).
        //float myFloatValue = (float) (5.4);
        float myFloatValue = 5f / 3f; // this way is better

        // witdh of double = 64 (8 bytes).
        double myDoubleValue = 5d / 3d;
        System.out.println("myInValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in a variable.
        // 3. Print out the resut.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double onePoundIsEqualToKilograms = 0.45359237d;
        System.out.println(onePoundIsEqualToKilograms);
        double myWeightValueInPounds = 118.5d / onePoundIsEqualToKilograms;
        System.out.println(myWeightValueInPounds);
        double myWeightValueInKilograms = myWeightValueInPounds * onePoundIsEqualToKilograms;
        System.out.println(myWeightValueInKilograms);
        System.out.println("The value is equal to: " + myWeightValueInKilograms + " Kilograms");
        double pi = 3.141_592_7d;// to be more easy to read.



    }
}
