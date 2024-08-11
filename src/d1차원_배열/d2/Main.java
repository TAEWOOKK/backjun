package d1차원_배열.d2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());

        int x = Integer.parseInt(stk.nextToken());


        stk = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            int y = Integer.parseInt(stk.nextToken());

            if(y < x){
                bw.write(String.valueOf(y)+" ");
            }

        }
        br.close();
        bw.flush();
        bw.close();
    }
}
