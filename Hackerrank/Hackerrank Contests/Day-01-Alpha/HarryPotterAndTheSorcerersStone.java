import java.util.*;
public class HarryPotterAndTheSorcerersStone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int last=num%10;
        while (num>=10){
            num/=10;
        }
        int first=num;
        System.out.println(first+last);
    }
}
