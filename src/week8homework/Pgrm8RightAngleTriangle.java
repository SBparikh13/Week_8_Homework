package week8homework;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Pgrm8RightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declare scanner
        System.out.println("Enter row number : ");
        int n = sc.nextInt();
        int x;
        int y;
        for(x=1;x<=n;x++){
            for(y=1;y<=x;y++){
                System.out.print("@");
            }
            System.out.println();
            sc.close();//closing scanner
        }
    }
}
