
        import java.util.*;

public class LoopsII  {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                a+=b;
                System.out.print(a+" ");
                b*=2;
            }
            System.out.println();
        }
    }
}
