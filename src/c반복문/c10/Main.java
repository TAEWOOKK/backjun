package c반복문.c10;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            StringBuilder s = new StringBuilder();

            for (int j = 1; j <= n; j++) {
                if(j > n-i){
                    s.append("*");
                }else{
                    s.append(" ");
                }
            }
            bw.write(s.toString()+"\n");
        }
        bw.flush();
        bw.close();
    }
}
