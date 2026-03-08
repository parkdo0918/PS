import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long x = a, y = b;
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }

        System.out.println(a / x * b);
    }
}