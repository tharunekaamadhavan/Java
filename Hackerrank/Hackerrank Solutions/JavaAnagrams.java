
import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length()){
            return false;
        }
        int chararray[]=new int[26];
        for(int i=0;i<a.length();i++){
            chararray[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++){
            chararray[b.charAt(i)-'a']--;
        }
        for(int i:chararray){
            if(i!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}