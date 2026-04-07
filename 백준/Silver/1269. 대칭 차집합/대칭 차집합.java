import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st0 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st0.nextToken());
        int m = Integer.parseInt(st0.nextToken());

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();


        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            set2.add(Integer.parseInt(st2.nextToken()));
        }

        int count=0;

        for(int a: set) if(!set2.contains(a)) count++;
        for(int b: set2) if(!set.contains(b)) count++;

        System.out.println(count);


    }
}