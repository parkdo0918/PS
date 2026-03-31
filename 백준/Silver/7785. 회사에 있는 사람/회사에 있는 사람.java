import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();

        for(int i=0;i<n;i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String action = st.nextToken();

            if (action.equals("enter")){
                set.add(name);
            } else {
                set.remove(name);
            }
        }

        List<String> result = new ArrayList<>(set);
        Collections.sort(result, Collections.reverseOrder());

        for(String name: result){
            System.out.println(name);
        }
    }
}