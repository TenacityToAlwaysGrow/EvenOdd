/*
 * Assignment 1, Question 2
 * Jennifer Carr
 */

package assignoneques1;

/**
 * Application that reads an integer and determines and prints whether
 * it's odd or even
 */

import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        Scanner numbers = new Scanner(System.in);

        //variables to hold number
        int num;

        //variables to hold comparison for odd / even
        int check;

        //prompt user for a number
        System.out.print("Enter number:");
        num = numbers.nextInt();

       

          //decide which scenario true for which messagae to display
          if (num % 2 == 0)
           {
            System.out.printf("\n The number %d is even \n", num);
        }

 else
          {
             System.out.printf("\n The number %d is odd \n", num);
            }//end if

     }//end main method
}//end main class

