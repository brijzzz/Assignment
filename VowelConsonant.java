package com.bridgelabz.BasicCoreProgram;

public class VowelConsonant {
    static void Vowel_Or_Consonant(char x)
    {
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o'
                || x == 'u')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }

    static public void main(String[] args)
    {
        Vowel_Or_Consonant('b');
        Vowel_Or_Consonant('u');
    }
}
