import java.util.*;
class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;

        }else{
            int num=x;
            int ispal=0;
            int i=0;
            while(x>0){
                int temp=x%10;
                ispal=ispal*10+temp;
                i++;
                x/=10;
            }
            return num==ispal;}

    }
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int x=sc.nextInt();
boolean res=isPalindrome(x);
System.out.println("Is the Number a Palindrome?");
System.out.println(res);

    }
}
