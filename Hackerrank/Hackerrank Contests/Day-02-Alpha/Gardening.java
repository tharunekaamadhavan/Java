import java.util.*;
public class Gardening {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int num=sc.nextInt();
        int column=(num-1)/row+1;
        if (column==2 || column==col-1){
            System.out.println("It is a mango tree");
        }else{
            System.out.println("It is not a mango tree");
        }

    }
}
