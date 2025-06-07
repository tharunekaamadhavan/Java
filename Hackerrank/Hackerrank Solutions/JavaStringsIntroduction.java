

import java.io.*;
        import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String one=sc.nextLine();
        String two=sc.nextLine();
        int len=one.length()+two.length();
        System.out.println(len);
        char a=one.charAt(0);
        char b=two.charAt(0);
        if(a>b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.print(one.substring(0, 1).toUpperCase() + one.substring(1).toLowerCase());
        System.out.print(" ");
        System.out.println(two.substring(0,1).toUpperCase()+two.substring(1).toLowerCase());

    }
}