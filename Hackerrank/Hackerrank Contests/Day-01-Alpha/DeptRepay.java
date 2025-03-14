import java.util.*;
public class DeptRepay {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float rate=sc.nextFloat();
        float yrs=sc.nextFloat();
        float interest=(p*rate*yrs)/100;
        System.out.printf("%.2f\n",interest);
        float amt=p+interest;
        System.out.printf("%.2f\n",amt);
        double discount=interest*0.02;
        System.out.printf("%.2f\n",discount);
        double finals=amt-discount;
        System.out.printf("%.2f\n",finals);

    }}

