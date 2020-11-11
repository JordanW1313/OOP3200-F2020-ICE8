/*
* Author: Jordan Wriker
* Date  : November 11, 2020
*/


package ca.durhmacollege;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Define our scanner

        Scanner keyboard = new Scanner(System.in);

        //Input

        String name = "";
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        float age = 0.0f;
        boolean isValidInput = false;

        while(!isValidInput)
        {
            try
            {
                System.out.print("Please enter your age: ");
                age = keyboard.nextFloat();
                isValidInput = true;

                if((age <= 0.0f ) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120.0 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Error: You must enter a valid floating-point number");
                keyboard.nextLine();
                isValidInput = false;
            }
        }

        //Output

        System.out.println();
        System.out.printf("You Entered: %s \n",name);
        System.out.printf("You Entered: %.2f \n",age);
    }
}
