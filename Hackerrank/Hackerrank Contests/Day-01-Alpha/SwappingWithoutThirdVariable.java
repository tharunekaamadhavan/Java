import java.util.*;
public class SwappingWithoutThirdVariable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The First value before Swapping:"+a);
        System.out.println("The Second value before Swapping:"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("The First value after Swapping:"+a);
        System.out.println("The Second value after Swapping:"+b);
    }
}
