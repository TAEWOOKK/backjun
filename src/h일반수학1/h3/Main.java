package h일반수학1.h3;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());


        for (int i = 0; i < a; i++) {

            int x = Integer.parseInt(br.readLine());

            int quarter = x/25;
            x = x%25;
            int dime = x/10;
            x = x%10;
            int nickel = x/5;
            x = x%5;

            bw.write(quarter+" "+dime+" "+nickel+" "+x);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
