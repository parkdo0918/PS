import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String[][] people = new String[n][2];

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people[i][0] = st.nextToken();
            people[i][1] = st.nextToken();
        }

        Arrays.sort(people,(a,b)-> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        StringBuilder sb = new StringBuilder();
        for (String[] p:people){
            sb.append(p[0]).append(" ").append(p[1]).append("\n");
        }
        System.out.print(sb);
    }
}