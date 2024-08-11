package c반복문.c7;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk;

        for (int i = 1; i <= n; i++) {

            stk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(stk.nextToken())+Integer.parseInt(stk.nextToken());

            bw.write("Case #"+i+": "+a+"\n");
        }

        bw.flush();
        bw.close();
    }
}
