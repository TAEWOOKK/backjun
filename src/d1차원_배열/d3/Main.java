package d1차원_배열.d3;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int min = 1000000, max = 0;

        StringTokenizer stk;

        for (int i = 0; i < n; i++) {

            stk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(stk.nextToken());

            if(min>a){
                min=a;
            }
            if(max<a){
                max=a;
            }
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
