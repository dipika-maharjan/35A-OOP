package Tasks.Week2;
import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        /*8. Take side of a square from user and print area and perimeter of it.
         *  Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. 
         * Take the attributes as user input. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side of the square ");
        int side = scan.nextInt();
        System.out.println("Enter the length of the triangle ");
        float length = scan.nextFloat();
        System.out.println("Enter the breadth of the triangle ");
        float breadth = scan.nextFloat();
        System.out.println("Enter the height of the cuboid ");
        float height = scan.nextFloat();
        System.out.println("Enter the width of the cuboid ");
        float width = scan.nextFloat();
        System.out.println("The perimeter is " + (4*side));
        System.out.println("The area of the triangle is " + (length*breadth/2));
        System.out.println("The volume of cuboid is " + (length*width*height));
        System.out.println("The volume of cube is " + (side*side*side));
        scan.close();
    }
    
}
