package k시간복잡도.k7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(stk.nextToken());
        int a0 = Integer.parseInt(stk.nextToken());

        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        if((a1*n)+a0 <= n*c && c>=a1){
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
}
