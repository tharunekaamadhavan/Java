
        import java.util.*;

public class Datatypes{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            try{
                long num=sc.nextLong();
                System.out.println(num+" can be fitted in:");
                if(num>=-128&&num<=127)System.out.println("* byte");
                if(num>=-32768&&num<=32767)System.out.println("* short");
                if(num>=-2147483648&&num<=2147483647)System.out.println("* int");
                if(num>=-9223372036854775808L&&num<=9223372036854775807L)System.out.println("* long");
            }
            catch (Exception e){
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}
