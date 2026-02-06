import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] board = new char[n][m];

        for (int i = 0; i<n; i++){
            board[i] = br.readLine().toCharArray();
        }

        int minCount = Integer.MAX_VALUE;

        for (int i =0; i<= n-8; i++){
            for (int j=0; j<= m-8; j++){

                int count = getMinPaint(board, i, j);
                minCount = Math.min(minCount, count);
            }
        }

        System.out.println(minCount);

    }

    static int getMinPaint(char[][] board, int startRow, int startCol){

        int pattern1 = 0;
        int pattern2 = 0;

        for (int i = 0; i< 8; i++){
            for (int j = 0; j< 8; j++){
                char current = board[startRow+i][startCol+j];

                if ((i+j) % 2 == 0){
                    if(current != 'W') pattern1++;
                    if(current != 'B') pattern2++;
                } else {
                    if(current != 'B') pattern1++;
                    if(current != 'W') pattern2++;
                }
            }
        }

        return Math.min(pattern1, pattern2);
    }
}