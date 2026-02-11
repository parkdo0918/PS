import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        char[] m = n.toCharArray();
        Arrays.sort(m);

        String str = new String(m);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb);

    }
}