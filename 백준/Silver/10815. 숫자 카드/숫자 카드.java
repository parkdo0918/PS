import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cards = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){
            int target = Integer.parseInt(st.nextToken());

            if (Arrays.binarySearch(cards, target) >= 0){
                sb.append("1");
            } else{
                sb.append("0");
            }
            if(i<m-1) sb.append(" ");
        }
        System.out.println(sb);

    }
}