package Tasks.Week3;

public class SwitchTwo {
    public static void main(String[] args) {
        /*2. Create a Java program that takes two numbers and an operator (+, -, *, /) 
        as inputs and performs the corresponding arithmetic operation using a switch case statement. */
        int num1 = 10;
        int num2 = 20;
        char operator = '-';
        switch(operator){
            case '+':
                System.out.println("Output " + (num1 + num2));
                break;
            case '-':
                System.out.println("Output " + (num1 - num2));
                break;
            case '*':
                System.out.println("Output " + (num1 * num2));
                break;
            case '/':
                System.out.println("Output " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator");
                break;

        }
    }
    
}
