package decision_structure;

import java.util.Scanner;

public class GradeMassage_switchExpression {
    public static void main(String[] args) {
        System.out.println("Enter your grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String massage =  switch (grade){
            case "A" -> "Excellent Job Zamil";
            case "B" -> "Great Job Zamil";
            case "C" -> "Good Job Zamil";
            case "D"-> "You can do better Zamil";
            case "E" -> "Oh no! Zamil ";

            default ->"Error You Enter a Wrong Grade";
        };
        System.out.println(massage);
    }
}
