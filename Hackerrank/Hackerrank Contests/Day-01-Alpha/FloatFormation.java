import java.util.*;
public class FloatFormation {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float inpu=sc.nextFloat();
        System.out.printf("%.6f\n",inpu);
        System.out.printf("%.4f\n",inpu);
        System.out.printf("%.2f\n",inpu);
        System.out.printf("%.0f\n",inpu);
    }
}
