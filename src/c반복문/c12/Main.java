package c반복문.c12;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n;

        StringTokenizer stk;

        while ((n =br.readLine()) != null) {
            stk = new StringTokenizer(n);
            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());

            bw.write(String.valueOf(a+b));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
