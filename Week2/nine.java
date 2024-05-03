package Tasks.Week2;

import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        /*9.Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter the Length ");
        double Length = scan2.nextDouble();
        System.out.println("Enter the Breadth");
        double Breadth = scan2.nextDouble();
        System.out.println("The area of rectangle is " + (Length * Breadth));
        int newIntValue = (int)(Length * Breadth); // Type casting to int
        System.out.println("Area (type casted to int): " + newIntValue);
        scan2.close();

    }
    
}
