import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [][]m = new int[n][2];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0;j<2;j++) {
                m[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(m,(a,b)->{
            if (a[1]== b[1]){
                return  a[0] - b[0];
            }
            return a[1]-b[1];
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(m[i][0]).append(" ").append(m[i][1]).append("\n");
        }

        System.out.println(sb);
    }
}