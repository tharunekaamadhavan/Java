
import java.util.*;
public class FriendlyPair {





        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int sum1=0;
            int sum2=0;
            for(int i=1;i<=num1/2;i++){
                if (num1%i==0){
                    sum1+=i;
                }
            }
            for (int j=1;j<=num2/2;j++){
                if (num2%j==0){
                    sum2+=j;
                }
            }
            //double ratio1=sum1/num1
            if(((double)sum2/num2) == ((double)sum1/num1)){
                System.out.println("Friendly Pair");
            }else{
                System.out.println("Not Friendly Pair");
            }


        }
    }

