package week8homework;
/**Read the numbers from the console entered by the user and print the minimum
 and maximum number the user has entered.
 -Before the user enters the number, print the message Enter number:
 -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 number.
 Hint:
 -Use an endless while loop.
 -Create a class with the name MinAndMaxInputChallenge.*/


import java.util.Scanner;

public class Pgrm2MinAndMaxInput {
    public static void main(String[] args) {
        Pgrm2MinAndMaxInput obj = new Pgrm2MinAndMaxInput();
        obj.input();

    }
    public void input() {
        int min;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num= sc.nextInt();
        min=max=num;

        while(sc.hasNextInt()){
           num = sc.nextInt();
           if(num<min){
               min=num;
           }if(num>max){
               max = num;
            }
            System.out.println("Minimum number is :" +min);
            System.out.println("Maximum number is : "+ max);
        }
        System.out.println("Minimum number is :" +min);
        System.out.println("Maximum number is : "+ max);
        sc.close();

        }


    }



