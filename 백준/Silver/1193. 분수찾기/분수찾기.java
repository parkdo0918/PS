import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int line = 1;
        int count =0;

        while(n > count + line){
            count += line;
            line++;
        }

        int offset = n-count;


        int a,b;
        if(line%2 == 0){
            a = offset;
            b = line - offset +1;
        }else{
            a = line - offset +1;
            b= offset;
        }

        System.out.println(a + "/" + b);

    }
}