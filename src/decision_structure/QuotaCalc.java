package decision_structure;

import java.util.Scanner;

public class QuotaCalc {
    public static void main(String[] args) {
        int quota = 10;
        System.out.println("Enter the number of sales made");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();


        if(sales >= quota){
            System.out.println("Congrats! You've made it your Quota");
        } else {
            int saleShorts = quota - sales;
            System.out.println( "You not making your quota. " +"You were " + saleShorts + " SaleShorts " ) ;
        }
    }
}
