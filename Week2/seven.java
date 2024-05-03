package Tasks.Week2;

import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        /*7. Take the name, roll number, and field of interest from the user and print in the format below:
         * Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        Scanner scan1 = new Scanner (System.in);
        System.out.println("Enter your name ");
        String name = scan1.nextLine();
        System.out.println("Enter your roll number ");
        String rollNumber = scan1.nextLine();
        System.out.println("Enter your field of interest ");
        String fieldOfInterest = scan1.nextLine();
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + "." + " My field of interest are " + fieldOfInterest + ".");
        scan1.close();
    }
    
}
