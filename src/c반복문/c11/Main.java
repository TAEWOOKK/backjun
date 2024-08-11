package c반복문.c11;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean run = true;

        StringTokenizer stk;

        while (true) {

            stk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(stk.nextToken());
            int b = Integer.parseInt(stk.nextToken());

            if(a == 0 && b == 0){
                br.close();
                bw.flush();
                bw.close();
                break;
            }else{
                bw.write(a+b+"\n");
            }
        }
    }
}
