import java.util.Scanner;

public class Tribonacci {
    public static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int t0 = 0, t1 = 1, t2 = 1, t3 = 0;
        for (int i = 3; i <= n; i++) {
            t3 = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = t3;
        }
        return t3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("Tribonacci(" + n + ") = " + tribonacci(n));
    }
}
