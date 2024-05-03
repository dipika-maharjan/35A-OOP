package Tasks.Week2;

import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        /*6. Take two integer inputs from the user. 
        First, calculate the sum of two, then the product of two. 
        Finally, calculate the division of the thus obtained sum and product and print the result. */
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number");
        int b = scan.nextInt();
        int sum = a + b;
        int product = a * b;
        System.out.println("The sum of two is " + sum);
        System.out.println("The product of two is " + product);
        System.out.println("The division of the thus obtained sum is " + sum/product);
        scan.close();
        
        
    }
    
}
