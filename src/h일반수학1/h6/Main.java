package h일반수학1.h6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int s = Integer.parseInt(br.readLine());

        int count = 3;

        int agosu = 1;

        int daumsu = 3;

        while (true){

            if(s > daumsu){

                agosu = daumsu;

                daumsu = daumsu+count;

                count++;
            }else {

                int bunmo = daumsu-agosu;

                if(s == 1){
                    bunmo = 1;
                }

                int bunja = 1;

                for (int i = 1; i <s-agosu; i++) {

                    bunmo--;
                    bunja++;
                }

                if((daumsu-agosu)%2 == 0){
                    System.out.println(bunja+"/"+bunmo);
                }else{
                    System.out.println(bunmo+"/"+bunja);
                }

                break;
            }
        }
    }
}
