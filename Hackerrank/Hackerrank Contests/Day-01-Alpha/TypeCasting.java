import java.util.*;
public class TypeCasting {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int inte=sc.nextInt();
        char character=sc.next().charAt(0);
        char charfin=(char)inte;
        int intfin=(int)character;
        System.out.println("Integer of "+inte+" is "+charfin);
        System.out.println("Character of "+character+" is "+intfin);
    }
}
