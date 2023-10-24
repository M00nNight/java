package loops;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        double rate = 25;
        double maxHours = 40;

        System.out.println("How many hours did you work?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while (hoursWorked > maxHours || hoursWorked < 0){
            System.out.println("Invalid entry. Your hours must be lie in between 0 to 40 .Please try again");
            hoursWorked = scanner.nextDouble();
        }

        double grossPay = hoursWorked * rate;
        System.out.println("your GrossPay: "+ grossPay);

    }
}
