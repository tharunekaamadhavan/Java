

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        String [] days={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        Calendar cal=Calendar.getInstance();
        cal.set(year,month-1,day);
        int p=cal.get(Calendar.DAY_OF_WEEK);
        return days[p-1];
    }

}

public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();

         String res=Result.findDay(day,month,year);
         System.out.println(res);
    }
}
