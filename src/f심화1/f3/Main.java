package f심화1.f3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());


        for (int i = 1; i < s; i++) {

            int x = 2*i-1;

            for (int j = 0; j < s-i; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < x; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        for (int i = s; i > 0; i--) {

            int x = 2*i-1;

            for (int j = 0; j < s-i; j++) {
                bw.write(" ");
            }

            for (int j = 0; j < x; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
