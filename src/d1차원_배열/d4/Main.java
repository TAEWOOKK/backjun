package d1차원_배열.d4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = 0, b = 0;

        for (int i = 1; i < 10; i++) {
            int x = Integer.parseInt(br.readLine());

            if(x > a){
                a = x;
                b = i;
            }
        }

        br.close();
        bw.write(String.valueOf(a)+"\n");
        bw.write(String.valueOf(b));
        bw.flush();
        bw.close();
    }
}
