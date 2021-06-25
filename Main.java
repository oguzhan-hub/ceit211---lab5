package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int choice; // The user's choice
        double value = 0; // The method's return value
        char letter; // The user's Y or N decision
        double radius; // The radius of the circle
        double length; // The length of the rectangle
        double width; // The width of the rectangle
        double height; // The height of the triangle
        double base; // The base of the triangle
        double side1; // The first side of the triangle
        double side2; // The second side of the triangle
        double side3; // The third side of the triangle
// Create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
// The do loop allows the menu to be displayed first
        do {
// TASK #1 Call the printMenu method
            printMenu();
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of " + "the circle: ");
                    radius = keyboard.nextDouble();
                    // TASK #3 Call the circleArea method and
                    value = circleArea(radius);
                    System.out.println("The area of the " +
                            "circle is " + value);
                    break;
                case 2:
                    System.out.print("Enter the length of " +
                            "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " +
                            "the rectangle: ");
                    width = keyboard.nextDouble();
                    // TASK #3 Call the rectangleArea method and
                    value = rectangleArea(width,length);
                    System.out.println("The area of the " +
                            "rectangle is " + value);
                    break;
                case 3:
                    System.out.print("Enter the height of " +
                            "the triangle: ");
                    height = keyboard.nextDouble();
                    System.out.print("Enter the base of " +
                            "the triangle: ");
                    base = keyboard.nextDouble();
                    // TASK #3 Call the triangleArea method and
                    value = triangleArea(height,base);
                    System.out.println("The area of the " +
                            "triangle is " + value);
                    break;
                case 4:
                    System.out.print("Enter the radius of " +
                            "the circle: ");
                    radius = keyboard.nextDouble();
                    // TASK #3 Call the circumference method and
                    value = circleCircumference(radius);
                    System.out.println("The circumference " +
                            "of the circle is " +
                            value);
                    break;
                case 5:
                    System.out.print("Enter the length of " +
                            "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " +
                            "the rectangle: ");
                    width = keyboard.nextDouble();
                    // TASK #3 Call the perimeter method and
                    value = rectanglePerimeter(width,length);
                    System.out.println("The perimeter of " +
                            "the rectangle is " +
                            value);
                    break;
                case 6:
                    System.out.print("Enter the length of " +
                            "side 1 of the " +
                            "triangle: ");
                    side1 = keyboard.nextDouble();
                    System.out.print("Enter the length of " +
                            "side 2 of the " +
                            "triangle: ");
                    side2 = keyboard.nextDouble();
                    System.out.print("Enter the length of " +
                            "side 3 of the " +
                            "triangle: ");
                    side3 = keyboard.nextDouble();
                    // TASK #3 Call the perimeter method and
                    value = trianglePerimeter(side1,side2,side3);
                    System.out.println("The perimeter of " +
                            "the triangle is " +
                            value);
                    break;
                default:
                    System.out.println("You did not enter " +
                            "a valid choice.");
            }
            keyboard.nextLine(); // Consume the new line
            System.out.println("Do you want to exit " +
                    "the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        } while (letter != 'Y' && letter != 'y');
    }

    //menu
    public static void printMenu(){
        System.out.println("Hello There! this is geometrical calculator:");
        System.out.println("1-) Circle Area finder");
        System.out.println("2-) Rectangle Area Finder");
        System.out.println("3-) Triangle Area Finder");
        System.out.println("4-) Circle Circumference");
        System.out.println("5-) Rectangle Perimeter");
        System.out.println("6-) Triangle Perimeter");
        System.out.println("Enter your selection: ");
    }
    //functions here
    static double circleArea(double radius){
        return (3.14 * radius * radius);
    }
    static double rectangleArea (double width, double lenght){
        return (width*lenght);
    }
    static double triangleArea (double height, double base){
        return (height*base);
    }
    static double circleCircumference(double radius){
        return (2*3.14*radius);
    }
    static double rectanglePerimeter(double width, double lenght){
        return ((2*lenght)+(2*width));
    }
    static double trianglePerimeter(double side1, double side2, double side3){
        return (side1+side2+side3);
    }
    // TASK #4 Write javadoc comments for each method
}