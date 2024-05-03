package Tasks.Week3;
import java.util.Scanner;

public class SwitchFour {
    public static void main(String[] args) {
        /* 4. Implement a Java program that calculates the area of different shapes 
        (circle, rectangle, square, triangle) based on the user's choice using a switch case.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a shape ");
        String shape = scan.next();
        switch(shape){
            case "circle":
                System.out.println("Enter the radius ");
                float radius = scan.nextFloat();
                float areaCircle = (float) 3.14*radius*radius;
                System.out.println("The area of circle is " + (areaCircle));
            case "rectangle":
                System.out.println("Enter the length ");
                int length = scan.nextInt();
                System.out.println("Enter the breadth ");
                int breadth = scan.nextInt();
                int areaRectangle = (int) length * breadth;
                System.out.println("The area of rectangle is " + areaRectangle);
            case "square":
                System.out.println("Enter the side ");
                int side = scan.nextInt();
                int areaSquare = (int) side * side;
                System.out.println("The area of square is " + areaSquare);
            case "triangle":
                System.out.println("Enter the height");
                int height = scan.nextInt();
                System.out.println("Enter the base");
                int base = scan.nextInt();
                int areaTriangle = (int) 0.5 * height * base;
                System.out.println("The area of triangle is " + areaTriangle);
                scan.close();


        }
        
        


    }
    
}
