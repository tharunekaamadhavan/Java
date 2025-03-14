import java.util.*;
public class Time {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int hrs=sc.nextInt();
        int mins=sc.nextInt();
        int secs=sc.nextInt();
        mins+=secs/60;
        secs=secs%60;
        hrs+=mins/60;
        mins%=60;
        System.out.println("Total Number of hours is "+hrs);
        System.out.println("Total Number of minutes is "+mins);
        System.out.println("Total Number of seconds is "+secs);
    }
}
