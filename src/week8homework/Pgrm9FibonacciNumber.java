package week8homework;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Pgrm9FibonacciNumber {
    public static void main(String[] args) {
        Pgrm9FibonacciNumber obj = new Pgrm9FibonacciNumber();//create object
        obj.fibonacci();//call instance method to main method
    }
    public void fibonacci(){//instance method
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci series upto : " );
        int n = sc.nextInt();
        int a = 1;
        int b = 1;

        while(a<=n){
            System.out.println(a + " ");
            int c = a + b;
            a=b;
            b=c;
        }sc.close();//closing scanner

    }





}

