import java.util.*;
public class SortColors{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]=new int[num];
        for(int i=0;i<num;a[i++]=sc.nextInt());
        Arrays.sort(a);
        for(int j=0;j<num;j++){
            System.out.print(a[j]+" ");
        }
    }
}