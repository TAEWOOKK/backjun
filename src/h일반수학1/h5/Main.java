package h일반수학1.h5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int s = Integer.parseInt(br.readLine());

        int count = 1;

        int agosu = 1;

        while(true){
            if(s <= agosu){
                System.out.println(count);
                break;
            }else{
                agosu = agosu + 6*count;
                count++;
            }
        }
    }
}
