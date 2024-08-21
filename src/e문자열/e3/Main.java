package e문자열.e3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String s = br.readLine();

            String a = s.substring(0, 1);
            String b = s.substring(s.length()-1, s.length());

            bw.write(a + b + "\n");
        }
        bw.flush();
        bw.close();
    }
}
