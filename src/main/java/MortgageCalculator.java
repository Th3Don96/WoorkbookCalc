import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class MortgageCalculator{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         // User input
        System.out.print("What is the principal of your loan?");
        double principalAmount = Integer.parseInt(scanner.nextLine());

        System.out.print("What is the interest rate of your loan?");
        double interestRate = scanner.nextDouble();

        System.out.print("What is th length of you loan in years?");
        double loanLength = scanner.nextDouble();

        //Mathmatic equation
        double amountOne = (principalAmount*(interestRate/100)/12);
        double amountTwo = Math.pow(1+((interestRate/100)/12),(loanLength*12));
        double amountThree = Math.pow(1+((interestRate/100)/12),(loanLength*12))-1;
        double AmountFour = amountOne*amountTwo;
        double monthlyAmount = (AmountFour/amountThree);
        double finalAmount = monthlyAmount*(loanLength*12);


       // System.out.println(monthlyypayment);
        //Monthly interrest
        System.out.printf("Total loan amount is %.2f", finalAmount );

        System.out.printf(" & Your monthly payment is $%.2f", monthlyAmount );

        System.out.printf(" & Your total intrest payment is $%.2f", (finalAmount-principalAmount));
    }


}
