package e문자열.e8;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s," ");

        bw.write(String.valueOf(st.countTokens()));
        bw.close();
    }
}
