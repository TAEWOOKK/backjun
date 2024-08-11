package d1차원_배열.d1;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int[] arr = new int[a];

        StringTokenizer stk = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            arr[i] = Integer.parseInt(stk.nextToken());
        }

        int v = Integer.parseInt(br.readLine());

        br.close();

        int x = 0;

        for(int b : arr){
            if(b == v){
                x++;
            }
        }

        bw.write(String.valueOf(x));
        bw.flush();
        bw.close();
    }
}
