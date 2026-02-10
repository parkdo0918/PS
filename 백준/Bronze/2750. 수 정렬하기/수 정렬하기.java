import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m[] = new int[n];

        for(int i=0;i<n;i++){
            m[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(m);

        StringBuilder sb = new StringBuilder();
        for(int value : m){
            sb.append(value).append("\n");
        }
        System.out.println(sb);


    }
}
