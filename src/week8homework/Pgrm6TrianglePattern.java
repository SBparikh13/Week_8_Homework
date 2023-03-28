package week8homework;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Pgrm6TrianglePattern {
    public static void main(String[] args) {
        int i,n,x;

        Scanner sc = new Scanner(System.in);//declare scanner
        System.out.println("Enter number of row : ");
        n = sc.nextInt();
        for( i =1;i<=n;i++){

          for(x=1;x<=i;x++){
              System.out.print(x);


          }System.out.println("");
        }sc.close();//closing scanner

    }
}
