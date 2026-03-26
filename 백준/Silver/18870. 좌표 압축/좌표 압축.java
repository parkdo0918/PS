import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] x = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0;i<n;i++){
            x[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted = Arrays.stream(x).distinct().sorted().toArray();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n;i++){
            int rank = Arrays.binarySearch(sorted, x[i]);
            if(i>0) sb.append(' ');
            sb.append(rank);
        }
        System.out.println(sb);
    }
}