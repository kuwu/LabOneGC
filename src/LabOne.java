import java.util.Scanner;

/**
 * Created by kuwu on 2017/06/26.
 */
public class LabOne {
    Scanner scnr = new Scanner(System.in); // create a scanner object

    public void check() {

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

    public static char getUserInput() {
        Scanner scnr = new Scanner(System.in); // create a scanner object
        System.out.println("Enter 'y' to continue or 'n' to quit");
        // cast uppercase to lowercase
        String userInput = scnr.next().toLowerCase();

        return userInput.charAt(0);
    }

    public  static void printUserInfo() {
        LabOne roomSize = new LabOne();
        roomSize.check();
    }

    public static void main(String[] args) {
        char userChar;
        boolean value = true;


        // runs room check one time before continue/check loop
        printUserInfo();


        // loop allows user to continue using 'y or Y' until the user
        // types 'n or N' to quit    validates for 'y or Y' and 'n or N'
        do {
            userChar = getUserInput();
            if (userChar == 'y') {
                printUserInfo();
            } else if (userChar == 'n') {
                value = false;
            } else {
                System.out.println(userChar + " is not y or n please re-enter");
            }

        } while (value);


        // Informing the user the program has ended
        System.out.print("Room Detail Generator Finished");

    }
}
