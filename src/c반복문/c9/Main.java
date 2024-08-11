package c반복문.c9;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            StringBuilder s = new StringBuilder();

            s.append("*".repeat(Math.max(0, i)));

            bw.write(s.toString()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
