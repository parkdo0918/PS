import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int sum=0;
            int num = i;

            while(num>0){
                sum+= num%10;
                num= num/10;
            }

            if(i+sum ==n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
}
