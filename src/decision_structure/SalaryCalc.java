package decision_structure;

import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 250.50;
        int quota = 10;

        System.out.println("How many sales employee get done in this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > quota){
            salary = salary + bonus;
        }
        System.out.println("Salary: " + salary);
    }
}
