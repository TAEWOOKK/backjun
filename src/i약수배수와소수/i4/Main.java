package i약수배수와소수.i4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        String[] split = s.split(" ");

        int count = 0;

        for (String su : split){

            int so = Integer.parseInt(su);

            int x = 0;

            for (int i = 1; i <= so; i++){

                if(so%i == 0){
                    x++;
                }
            }
            if(x == 2){
                count++;
            }
        }

        System.out.println(count);
    }
}
