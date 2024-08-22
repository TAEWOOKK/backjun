package e문자열.e7;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer stk;
        for (int i = 0; i < a; i++) {

            stk = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(stk.nextToken());

            String c = stk.nextToken();

            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < c.length(); j++) {

                String one = c.substring(j,j+1);

                for (int k = 0; k < b; k++) {
                    stringBuilder.append(one);
                }
            }
            bw.write(stringBuilder.toString()+"\n");
        }

        bw.flush();
        bw.close();
    }
}
