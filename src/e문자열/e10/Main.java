package e문자열.e10;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr1 = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

        int[] arr2 = new int[arr1.length];

        int second = 3;

        int j = 1;

        for (int i = 0; i < arr1.length; i++) {

            arr2[i] = second;

            if(arr1[i].equals("R") || arr1[i].equals("Y")){
                j = j-1;
            }

            if(j%3 == 0){
                second++;
            }

            j++;
        }

        String s = br.readLine();

        String[] split = s.split("");

        List<String> newlist = List.of(arr1);

        int result = 0;

        for (String str : split) {

            int i = newlist.indexOf(str);

            result += arr2[i];
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
