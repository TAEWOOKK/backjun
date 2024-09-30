package i약수배수와소수.i3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            int n = Integer.parseInt(br.readLine());

            if(n == -1){
                break;
            }

            List<Integer> list = new ArrayList<>();
            int sum = 0;

            for (int i = 1; i < n; i++) {

                if(n%i == 0){
                    list.add(i);
                    sum+=i;
                }
            }

            if(sum == n){
                bw.write(n+" = ");

                for (int i = 0; i <list.size(); i++) {
                    if(i == list.size()-1){
                        bw.write(String.valueOf(list.get(i)));
                    }else{
                        bw.write(list.get(i)+" + ");
                    }
                }
            }else{
                bw.write(n+" is NOT perfect.");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
