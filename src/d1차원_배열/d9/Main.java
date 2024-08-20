package d1차원_배열.d9;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] arr = new int[n+1];
        int[] oriarr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = i;
            oriarr[i] = i;
        }

        for (int i = 1; i <= m; i++) {

            stk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());


            int c = b;
            for (int j = a; j <= b; j++) {
                arr[j] = oriarr[c];
                c--;
            }
        }

        br.close();

        for (int i = 1; i <= n; i++) {

            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}
