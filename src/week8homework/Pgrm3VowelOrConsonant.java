package week8homework;
/** Write a Java program that takes the user to provide a single character from the
 alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 error message.
 For eg:
 Input an alphabet: p
 Expected Output:
 Input letter is Consonant*/


import java.util.Scanner;

public class Pgrm3VowelOrConsonant {
    public static void main(String[] args) {
        Pgrm3VowelOrConsonant obj = new Pgrm3VowelOrConsonant();
        obj.alphabet();

    }
    public void alphabet(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("Entered character " + ch + " is a Vowel.");
        }else if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z')){
            System.out.println("Entered character  " + ch + " is Consonant.");
        }else{
            System.out.println("Not a character.  ");
        }sc.close();


    }
}
