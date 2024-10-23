package l브루트포스.l3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int bunmo = (b*d) - (a*e);
        int bunja = (b*f) - (c*e);

        int x = bunja/bunmo;

        int y = 0;
        if(b == 0){
            y = (f-(d*x))/e;
        }else{
            y = (c-(a*x))/b;
        }


        System.out.println(x+" "+y);
    }
}
