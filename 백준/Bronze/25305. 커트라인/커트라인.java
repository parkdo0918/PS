import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int m[] = new int[n];

        for (int i=0; i<n;i++){
            m[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(m);

        System.out.println(m[n-k]);
    }
}