import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/26.
 */
public class LabOne {
    Scanner scnr = new Scanner(System.in); // create a scanner object


    public void check(){
        System.out.println("Welcome to Grand Circus' Room Detail Generator!\n\n" + "Please enter the length: ");
        double length = scnr.nextDouble();
        System.out.println("Please enter the width: ");
        double width = scnr.nextDouble();
        System.out.println("Please enter the height: ");
        double height = scnr.nextDouble();


        // find the area of a rectangle
        double area = length * width;
        // find the perimeter of a rectangle
        double perimeter = length * 2 + width * 2;
        // find the volume of a rectangle
        double volume = length * width * height;

        // print the results for area and perimeter
        System.out.println("The area of the Grand Circus Room is: " + area);
        System.out.println("The perimeter of the Grand Circus Room is: " + perimeter);
        System.out.println("The volume of the Grand Circus Room is: " + volume + "\n");




    }

    public static void main (String [] args){
        Scanner scnr = new Scanner(System.in);
        char userChar = '_';
        String userInput;


        // loop allows user to input numerous numbers using 'y' until the user
        // types 'q' to quit
        while (userChar != 'n') {


        LabOne roomSize = new LabOne();
        roomSize.check();

            System.out.println("Enter 'y' to continue or 'n' to quit");
            userInput = scnr.next();
            userChar = userInput.charAt(0);

        }

        // Informing the user the program has ended
        System.out.print("Room Detail Generator Finished");

    }
}
