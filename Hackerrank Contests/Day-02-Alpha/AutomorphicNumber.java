import java.util.*;
public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inp=sc.nextInt();
        if (inp<0 || inp>9){
            System.out.println("Invalid Input");
        }else{
            int sq=inp*inp;
            if (sq%10==inp){
                System.out.println("Automorphic Number");
            }else{
                System.out.println("Not Automorphic Number");
            }
        }
    }
}
