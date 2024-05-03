package Tasks.Week3;

public class SwitchThree {
    public static void main(String[] args) {
        /*3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season 
        (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */
        int num = 19;
        switch(num){
            case 1:
            case 2:
            case 3:
                System.out.println("Winter");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Spring");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Summer");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
    }
    
}
