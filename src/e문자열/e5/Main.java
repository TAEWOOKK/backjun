package e문자열.e5;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        String n = br.readLine();


        int sum = 0;

        for (int i = 0; i < a; i++) {

            sum += Integer.parseInt(n.substring(i,i+1));
        }

        br.close();
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
