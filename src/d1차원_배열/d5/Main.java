package d1차원_배열.d5;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[]arr = new int[n+1];

        for (int i = 1; i <= m; i++) {

            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            for (int j = a; j <= b; j++) {
                arr[j] = c;
            }
        }

        br.close();
        for (int i = 1; i <= n; i++) {
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}
