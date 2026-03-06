import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];

        for (int i=0;i<n;i++){
            words[i] = br.readLine();
        }

        Arrays.sort(words,(a,b) -> {
            if (a.length() != b.length()) return a.length() - b.length();
            return  a.compareTo(b);
        }
    );
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<n; i++){
            if (i==0 || !words[i].equals(words[i-1])){
                sb.append(words[i]).append("\n");
            }
        }
        System.out.println(sb);

    }
}