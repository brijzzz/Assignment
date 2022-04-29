package com.bridgelabz.BasicCoreProgram;

public class LargestNumber {
    static int LargestOfThree(int x, int y, int z)
    {

        if (x >= y && x >= z)

            return x;

        else if (y >= x && y >= z)

            return y;

        else

            return z;
    }

    static public void main(String[] args)
    {
        int a, b, c, largest;

        a = 60;
        b = 10;
        c = 40;

        largest = LargestOfThree(a, b, c);

        System.out.println(largest
                + " is the largest number.");
    }
}
