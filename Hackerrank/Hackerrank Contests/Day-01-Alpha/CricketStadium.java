import java.util.*;
public class CricketStadium {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int peri=2*(length+breadth);
        int area=length*breadth;
        System.out.println(peri);
        System.out.println(area);
    }
}
