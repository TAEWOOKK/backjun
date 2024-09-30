package i약수배수와소수.i2;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;

        int su = 1;

        while (true) {

            if(su > n) {
                System.out.println(0);
                break;
            }

            if(n%su == 0){
                count++;
            }

            if(count==k){
                System.out.println(su);
                break;
            }
            su++;
        }
    }
}
