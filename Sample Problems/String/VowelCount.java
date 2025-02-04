import java.util.*;
public class VowelCount {
    public static void main (String[]args){
        System.out.println("Enter words:");
        Scanner sc=new Scanner(System.in);
        String inp=sc.nextLine();
        String Vowel="aeiouAEIOU";
        int count=0;
        for (int i=0;i<inp.length();i++){
            if(Vowel.indexOf(inp.charAt(i))!=-1){//indexOf() returns 1 if the the element is present
                count++;}

        }
        System.out.println(count);
    }
}
