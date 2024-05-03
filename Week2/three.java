package Tasks.Week2;

public class three {
    public static void main(String[] args) {
         /*Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
          Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side;*/
         
        float length = 10f;
        float breadth = 25.5f;
        float height = 50f;
        int side = 10;
        float width = 15f;
        System.out.println("The area of the triangle is " + (length * breadth/2));
        System.out.println("The volume of cuboid is " + (length * width * height));
        System.out.println("The volume of cube is " + (side * side * side));

    }
    
}
