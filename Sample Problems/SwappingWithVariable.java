import java.util.*;
public class SwappingWithVariable {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number, a: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number, b: ");
        int b=sc.nextInt();
        System.out.println("Number 'a' before swapping: "+a);
        System.out.println("Number 'b' before swapping: "+b);
        int c=0;
        c=a;
        a=b;
        b=c;
        System.out.println("Number 'a' after swapping: "+a);
        System.out.println("Number 'b' after swapping: "+b);
    }
}
