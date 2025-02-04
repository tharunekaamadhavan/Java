import java.util.*;
public class FencingTheGround {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float len=sc.nextFloat();
        float breadth=sc.nextFloat();

        System.out.printf("Required length is %.2fm\n",(2*(len+breadth)));
        System.out.printf("Required quantity of carpet is %.2fsqm\n",(len*breadth));
    }
}
