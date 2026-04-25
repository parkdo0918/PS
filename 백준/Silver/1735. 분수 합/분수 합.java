import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        long c = sc.nextLong(), d = sc.nextLong();

        long num = a * d + c * b;
        long den = b * d;

        long g = gcd(num, den);
        System.out.println(num / g + " " + den / g);
    }

    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}