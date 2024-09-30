package i약수배수와소수.i6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<Integer>();

        boolean flag = true;

        if(n != 1){
            while (true) {

                int su = 2;

                while (true) {

                    if(su == n){
                        flag = false;
                        list.add(n);
                        break;
                    }

                    if(n%su == 0){
                        n = n/su;
                        list.add(su);
                    }else{
                        su++;
                    }
                }

                if(!flag){
                    break;
                }
            }
            for(int i : list){
                System.out.println(i);
            }
        }
    }
}
