import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidationClientAdd {

    public static String validationName() {
        String customerName = "customerName";
        boolean errorName = true;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                customerName = scan.next("^[A-Za-z ]*$");
                errorName = false;
            } catch (InputMismatchException e) {
                System.err.println("The value given is not a name.");
                System.out.println(" ");
                System.out.println("Please enter a valid name:");
            }
        } while (errorName);
        return customerName;
    }


    public static double validationCustomerNumber() {
        double customerNumber = 0;
        boolean errorNumber = true;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                customerNumber = scan.nextDouble();
                errorNumber = false;
            } catch (InputMismatchException e) {
                System.err.println("The value given is not a number.");
                System.out.println(" ");
                System.out.println("Please enter a valid value:");
            }
        } while (errorNumber);
        return customerNumber;
    }

    public static double validationOrderNumber() {
        double orderNumber = 0;
        boolean errorNumber = true;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                orderNumber = scan.nextDouble();
                errorNumber = false;
            } catch (InputMismatchException e) {
                System.err.println("The value given is not a number.");
                System.out.println(" ");
                System.out.println("Please enter a valid value:");
            }
        } while (errorNumber);
        return orderNumber;
    }

}