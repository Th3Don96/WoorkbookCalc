import java.util.Scanner;


public class Calculator2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // User input
        System.out.print("How much do you want to deposit in your CD?");
        double depositAmount = Integer.parseInt(scanner.nextLine());

        System.out.print("What is the interest rate of your CD?");
        double interestRate = scanner.nextDouble();

        System.out.print("What is th length of you CD in years?");
        double maturateLength = scanner.nextDouble();

    }
}
