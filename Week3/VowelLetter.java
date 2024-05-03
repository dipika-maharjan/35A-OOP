package Tasks.Week3;

import java.util.Scanner;

public class VowelLetter {
    public static void main(String[] args) {
        /*6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet");
        char alphabet = scan.next().charAt(0); // Read a character input from the user
        if((alphabet=='a') || (alphabet == 'e') || (alphabet == 'i') || (alphabet == 'o') || (alphabet == 'u') ){
            System.out.println("It is vowel");
        }else{
            System.out.println("It is consonant");
        }
        scan.close();
    }
    
}
