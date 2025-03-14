import java.util.*;
public class LargestAmongThree {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3=sc.nextInt();
        System.out.println((num1>num2 && num1>num3)? num1+" is the largest number":(num2>num3)? num2+" is the largest number":num3+" is the largest number" );
    }
}
