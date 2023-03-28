package week8homework;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Pgrm10ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :" );
        int n = sc.nextInt();
        int a = n;//temp number
        int p = 0;

        while(n>0){
            int b = n%10;//remainder
            n=n/10;
            p=(p)+(b*b*b);

        }
        if (a==p){
            System.out.println(a+"  is Armstrog number. ");

        }else{
            System.out.println(a+ " is not Armstrong number.");
        }sc.close();//closing scanner

    }

}
