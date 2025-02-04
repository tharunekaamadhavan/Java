import java.util.*;
public class TreasureFinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sec=(a>b && a>c)?Math.max(b,c):(b>c)?Math.max(a,c):Math.max(a,b);
        int maxi=(a>b && a>c)?a:(b>c)?b:c;
        int fin=maxi/2;
        int fina=0;
        for (int i=1;i<=fin;i++){
            if (a%i==0 && b%i==0 && c%i==0){
                fina=i;
            }
        }
        System.out.println("The treasure is in the box which has number "+sec+".");
        System.out.println("The code to open the box is "+fina+".");
    }
}

