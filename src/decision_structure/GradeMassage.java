package decision_structure;

import java.util.Scanner;

public class GradeMassage {
    public static void main(String[] args) {
        System.out.println("Enter your grade?");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();

        String massage;

        switch (grade){
            case "A":
                massage = "Excellent Job Zamil";
                break;
            case "B":
                massage = "Great Job Zamil";
                break;
            case "C":
                massage = "Good Job Zamil";
                break;
            case "D":
                massage = "You can do better Zamil";
                break;
            case "E":
                massage = "Oh no! Zamil ";
                break;
            default:
                massage = "Error You Enter a Wrong Grade";
        }
        System.out.println(massage);
    }
}
