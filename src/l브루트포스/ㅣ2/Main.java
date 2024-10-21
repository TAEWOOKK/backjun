package l브루트포스.ㅣ2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int n = Integer.parseInt(br.readLine());

        int m = 0;

        while (true){

            int number = m;

            if(m>n){
                System.out.println(0);
                break;
            }

            int sum = 0;
            while (true){

                sum += number%10;
                number = number/10;

                if(number==0){
                    break;
                }
            }

            if(sum+m == n){
                System.out.println(m);
                break;
            }else{
                m++;
            }
        }
    }
}
