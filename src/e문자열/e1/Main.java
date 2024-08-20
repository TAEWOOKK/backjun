package e문자열.e1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int i = Integer.parseInt(br.readLine());

        String substring = s.substring(i-1, i);

        br.close();
        bw.write(substring);
        bw.flush();
        bw.close();
    }
}
