package Tasks.Week2;

public class ten {
    public static void main(String[] args) {
        /*10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. 
        And use the following conditions to generate the final result;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper Second Class
        c. If more than 49 -> Second class
        d. If more than 39 -> Third class and if below than 40 the result is fail. 
        Hint: Use ternary operator */
        int English = 50; int Maths = 60; int Science = 70; int Nepali = 80;
        int Total = English + Maths + Science + Nepali;
        System.out.println("Total marks " + (Total));
        double percentage = (double) Total / 4;
        System.out.println("Percentage " + (percentage));
        String output = percentage >= 70 ? "First Class" :
                        percentage > 59 ? "Upper Second Class" :
                        percentage > 49 ? "Second Class" :
                        percentage > 39 ? "Third Class" : "Fail";
        System.out.println(output);
    }
    
}
