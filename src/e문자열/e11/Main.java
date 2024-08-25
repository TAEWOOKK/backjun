package e문자열.e11;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n;

        StringTokenizer stk;

        while ((n = br.readLine()) != null) {
            stk = new StringTokenizer(n);

            bw.write(n);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
