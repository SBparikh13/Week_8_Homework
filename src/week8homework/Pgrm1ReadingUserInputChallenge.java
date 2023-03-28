package week8homework;
/*1. Read 10 numbers from the console entered by the user and print the sum of those
numbers
-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
-If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
10 numbers.
-Use the nextInt() method to get the number and add it to the sum.
-Before the user enters each number, print the message Enter number #x: where x represents the
count, i.e. 1, 2, 3, 4, etc.
-For example, the first message printed to the user would be Enter number #1:, the next Enter number
#2:, and so on.
Hint:
-Use a while loop.
-Use a counter variable for counting valid numbers.
-Close the scanner after you don't need it anymore.
-Create a class with the name ReadingUserInputChallenge
*/

import java.util.Scanner;

public class Pgrm1ReadingUserInputChallenge {
    public static void main(String[] args) {
        Pgrm1ReadingUserInputChallenge obj = new Pgrm1ReadingUserInputChallenge();//calling instance method to main method
        obj.sum();

        }
        public void sum(){//instance method
        Scanner sc = new Scanner(System.in);//declare scanner
        int counter = 1;
        int sum = 0;
        while(counter<=10){//condition
            System.out.println("Enter number # : " );
            boolean hasNextInt= sc.hasNextInt();
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                sum = sum + num;
                counter++;
            }else{
                System.out.println("Please enter valid number ");
                sc.next();
            }

        }
            System.out.println("Sum of 10 number is "+ sum);
        sc.close();

        }

}
