import java.util.*;
public class PlacingTheFlagPost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int len=sc.nextInt();
        System.out.println("x-coordinate:"+x);
        System.out.println("y-coordinate:"+y);
        System.out.println("Length:"+len);
        System.out.println("Centre of the ground is at ("+((x+len/2))+","+(y+len/2)+")");
    }
}
