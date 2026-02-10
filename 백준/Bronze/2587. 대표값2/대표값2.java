import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m[] = new int[5];
        int n=0;

        for(int i=0;i<5;i++){
            m[i] = Integer.parseInt(br.readLine());
            n += m[i];
        }

        System.out.println(n/5);
        Arrays.sort(m);
        System.out.println(m[2]);


    }
}