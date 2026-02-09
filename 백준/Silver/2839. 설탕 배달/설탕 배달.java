import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bags = 0;

        while(true){
            if(n%5==0){
                bags += n/5;
                System.out.println(bags);
                break;
            }

            n-= 3;
            bags++;

            if(n<0){
                System.out.println("-1");
                break;
            }

        }
    }
}
