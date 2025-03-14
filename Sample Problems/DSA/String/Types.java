import java.util.*;
public class Types {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String inp=sc.nextLine();
String Vowel="aeiouAEIOU";
String Consonant="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
String Special=" !@#$%^&*_-+=()[]{}/?,<>";
String Num="1234567890";
int vc=0,cc=0,spc=0,nc=0;
for (int i=0;i<inp.length();i++){
    if(Vowel.indexOf(inp.charAt(i))!=-1){
        vc++;
    }
    else if(Consonant.indexOf(inp.charAt(i))!=-1){
        cc++;
    }
    else if (Special.indexOf(inp.charAt(i))!=-1){
        spc++;
    }
    else if (Num.indexOf(inp.charAt(i))!=-1){
        nc++;
    }
}
System.out.println(cc+" => Number of Consonants");
System.out.println(vc+" => Number of Vowels");
System.out.println(spc+" => Number of Special Characters");
System.out.println(nc+" => Number of integers");
    }
}
