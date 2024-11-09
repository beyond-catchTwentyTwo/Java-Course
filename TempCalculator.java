// 1. Create Scanner

// 2. Create variables for:
//    - temperature value
//    - conversion choice (1 for C to F, 2 for F to C)
//    - continue program choice (yes/no)

// 3. Use do-while for main program loop:
//    - Show menu (C to F or F to C)
//    - Get user choice
//    - Get temperature value
//    - Convert and show result
//    - Ask if user wants to continue

// 4. Use while for input validation:
//    - Menu choice must be 1 or 2
//    - Temperature must be between -100 and 100
import  java.util.Scanner;
public class TempCalculator {
    public static void main(String[] args){

        // Block for scanner and variables
        Scanner userIn = new Scanner(System.in);
        double cTemp; // for easy math
        double fTemp; // for easy math
        double result;
        int menuChoice;

        do {
            // Menu and Choice
            System.out.println("Please choose the conversion:");
            System.out.println("1: Celsius to Fahrenheit");
            System.out.println("2: Fahrenheit to Celsius");
            System.out.println("3: Close converter");
            menuChoice = userIn.nextInt();

            // userIn and math: Celsius to Fahrenheit
            if (menuChoice == 1) {
                System.out.println("Enter degrees Celsius e.g 2,4: ");
                cTemp = userIn.nextDouble();
                result = (cTemp * (9.0/5.0)) + 32;
                System.out.println(cTemp + " is " + result + " in Degrees Fahrenheit");

                // userIn and math: Fahrenheit to Celsius
            } else if (menuChoice == 2) {
                System.out.println("Enter degrees Fahrenheit e.g 2,4: ");
                fTemp = userIn.nextDouble();
                result = (fTemp - 32) * (5.0/9.0);
                System.out.println(fTemp + " is " + result + " in Degrees Celsius");
            }
            //exit condition
        } while (menuChoice != 3);
        System.out.println("Good Bye :-)");
    }
}
