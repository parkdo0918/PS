import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, String> numToName = new HashMap<>();
        HashMap<String, Integer> nameToNum = new HashMap<>();

        for (int i=1;i<=n;i++){
            String name = br.readLine();
            numToName.put(i,name);
            nameToNum.put(name,i);
        }

        for (int i=0;i<m;i++){
            String query = br.readLine();

            if (Character.isDigit(query.charAt(0))) {
                sb.append(numToName.get(Integer.parseInt(query)));
            }else  {
                sb.append(nameToNum.get(query));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}