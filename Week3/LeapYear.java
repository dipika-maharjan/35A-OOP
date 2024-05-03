package Tasks.Week3;

public class LeapYear {
    public static void main(String[] args) {
        /*5. Write a JAVA program to check whether a year is a leap year or not. 
        Hint: if year%4==0; if year%100!=0 ; year%400==0;  */
        int year = 2004;
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
    }
    
}
