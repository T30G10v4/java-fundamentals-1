package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int infLimit = 1;
        int supLimit = 1000;
        int numbers = 0;
        String fizzBuzz = "";
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Inserisci un numero tra " + infLimit + " e " + supLimit);
            numbers = scan.nextInt();

        } while(numbers < infLimit || numbers > supLimit);

        for(int i = 1; i<=numbers; i++)
        {
            fizzBuzz = "Numero "+i+" ";
            if(i%3 == 0)
            {
                fizzBuzz+="Fizz";
            }

            if(i%5 == 0)
            {

                fizzBuzz+="Buzz";

            }

            System.out.println(fizzBuzz);

        }

        scan.close();
    }
}
