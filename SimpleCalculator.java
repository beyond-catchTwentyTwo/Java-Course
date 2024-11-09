import  java.util.Scanner; // import Scanner Modul
public class SimpleCalculator{
    public static void main(String[] args){
        Scanner userIN = new Scanner(System.in); // define scanner as userIN
        double result; // open variable for result


        // ask for userIN and asign to variable
        System.out.println("Bitte Zahl eingeben e.g. 2,5: ");
        double numberOne;
        numberOne = userIN.nextDouble();

        // ask for userIN and asign to variable
        System.out.println("Bitte Operator eingeben e.g. + - * /: ");
        char operator = userIN.next().charAt(0);

        // ask for userIN and asign to variable
        System.out.println("Bitte Zahl eingeben e.g. 2,5: ");
        double numberTwo;
        numberTwo = userIN.nextDouble();

        // if, else if, else loop for calculation
        // with included test for division by zero
        if (operator == '+'){
            result = numberOne + numberTwo;
            System.out.println("Das Ergebnis ist: " + result);
        } else if (operator == '-') {
            result = numberOne - numberTwo;
            System.out.println("Das Ergebnis ist: " + result);
        } else if (operator == '*') {
            result = numberOne * numberTwo;
            System.out.println("Das Ergebnis ist: " + result);
        }
        else if (operator == '/' && numberTwo != 0.00){
            result = numberOne / numberTwo;
            System.out.println("Das Ergebnis ist:" + result);
        }else {
            System.out.println("Division durch Null nicht möglich");
        }
        // closing Scanner
        userIN.close();
    }
}