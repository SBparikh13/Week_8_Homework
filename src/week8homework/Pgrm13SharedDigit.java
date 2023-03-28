package week8homework;

import java.util.Scanner;

/**
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class Pgrm13SharedDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declare scanner
        System.out.println("Enter first number :");
        int x = sc.nextInt();
        System.out.println("Enter second number ");
        int y = sc.nextInt();
        System.out.println("Result : "+ hasShareDigit(x,y));
        sc.close();//closing scanner
    }
    public static boolean hasShareDigit(int a,int b){//boolean static method
       if(a<10 || b>99)
           return false;
       int p = a%10;
       int q=b%10;
       a/=10;
       b/=10;
       return (a==b||a==q||p==b||p==q);
        }

    }

