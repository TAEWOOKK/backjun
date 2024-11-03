package l브루트포스.l5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int n = Integer.parseInt(br.readLine());

        int x = 0;
        int count = 0;
        while (true) {

            String su = String.valueOf(x);


            if(su.contains("666")){
                count++;
            }
            if(count == n){
                System.out.println(x);
                break;
            }else{
                x++;
            }
        }
    }
}
