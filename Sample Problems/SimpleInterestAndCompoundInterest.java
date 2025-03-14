import java.util.*;
public class SimpleInterestAndCompoundInterest {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();

        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();

        System.out.print("Enter the time: ");
        double time = input.nextDouble();

        double interest = (principal * time * rate) / 100;

        System.out.println("Principal: " + principal);
        System.out.println("Interest Rate: " + rate);
        System.out.println("Time Duration: " + time);
        System.out.println("Simple Interest: " + interest);
        System.out.print("Enter the principal: ");
        double principal1 = input.nextDouble();

        System.out.print("Enter the rate: ");
        double rate1 = input.nextDouble();

        System.out.print("Enter the time: ");
        double time1 = input.nextDouble();

        System.out.print("Enter number of times interest is compounded: ");
        int number = input.nextInt();

        double interest1 = principal1 * (Math.pow((1 + rate1/100), (time1 * number))) - principal1;

        System.out.println("Principal: " + principal1);
        System.out.println("Interest Rate: " + rate1);
        System.out.println("Time Duration: " + time1);
        System.out.println("Number of Time interest Compounded: " + number);
        System.out.println("Compound Interest: " + interest1);


    }
}
