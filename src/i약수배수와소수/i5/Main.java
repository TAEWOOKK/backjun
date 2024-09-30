package i약수배수와소수.i5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int min = Integer.parseInt(br.readLine());

        int max = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<Integer>();

        int sum = 0;

        for (int i = min; i <= max; i++) {

            int count = 0;
            for (int j = 1; j <= i; j++) {

                if(i%j==0){
                    count++;
                }
            }

            if(count == 2){
                list.add(i);
                sum += i;
            }
        }

        if(list.isEmpty()){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }
    }
}
