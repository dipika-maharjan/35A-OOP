package Tasks.Week3;

public class SwitchOne {
    public static void main(String[] args) {
        /*1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. 
        Use a switch case statement to handle different grades. */
        char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("4.0");
                break;
            case 'B':
                System.out.println("3.0"); 
                break;
            case 'C':
                System.out.println("2.0");
                break;
            case 'D':
                System.out.println("1.0");
                break;
            default:
                System.out.println("0.0");
                break;

        }
    }
    
}
