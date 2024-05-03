package Tasks.Week3;

public class GreatestNumber {
    public static void main(String[] args) {
        /*1. Write a JAVA program to find the maximum between three numbers. */
        int num1 = 10; int num2 = 20; int num3 = 30;
        if (num1>num2 && num1>num3){
            System.out.println("Num1 is the greatest");
        }else if(num2>num1 && num2>num3){
            System.out.println("Num2 is the greatest");
        }else{
            System.out.println("Num3 is the greatest");
        }
    }
    
}
