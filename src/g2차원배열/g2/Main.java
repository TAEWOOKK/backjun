package g2차원배열.g2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = -1;

        int x = 0;
        int y = 0;

        int[][] arr = new int[9][9];

        StringTokenizer stk;

        for (int i = 0; i < 9; i++) {

            stk = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }

        bw.write(String.valueOf(max));
        bw.newLine();
        bw.write(String.valueOf(x)+" "+String.valueOf(y));
        bw.flush();
        bw.close();
    }
}
