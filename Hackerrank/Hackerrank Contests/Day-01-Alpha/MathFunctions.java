import java.util.*;
public class MathFunctions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float first=sc.nextFloat();
        float second=sc.nextFloat();
        int third=sc.nextInt();
        int fourth=sc.nextInt();
        System.out.println((int)Math.floor(first));
        System.out.println((int)Math.ceil(first));
        System.out.println((int)Math.sqrt(second));
        System.out.println((int)Math.pow(third,fourth));
    }
}
