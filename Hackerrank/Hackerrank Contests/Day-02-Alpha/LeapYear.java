import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int yr=sc.nextInt();
        if((yr%400==0)||(yr%100!=0 && yr%4==0)){
            System.out.println(yr+" is a leap year");
        }else{
            System.out.println(yr+" is not a leap year");
        }
    }
}
