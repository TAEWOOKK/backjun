package f심화1.f2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = {1,1,2,2,2,8};

        StringTokenizer stk = new StringTokenizer(br.readLine());

        for (int i = 0; i < a.length; i++) {

            int s = Integer.parseInt(stk.nextToken());

            bw.write(String.valueOf(a[i]-s)+" ");
        }
        bw.flush();
        bw.close();
    }
}
