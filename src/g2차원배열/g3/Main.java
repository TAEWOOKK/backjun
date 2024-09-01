package g2차원배열.g3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        List<Map<Integer, String>> list = new ArrayList<Map<Integer, String>>();

        int max = 0;

        for (int i = 0; i < 5; i++) {

            String s = br.readLine();

            String[] split = s.split("");


            if(max < s.length()){
                max = s.length();
            }

            Map<Integer, String> map = new HashMap<Integer, String>();

            for (int j = 0; j < split.length; j++) {

                map.put(j,split[j]);

            }
            list.add(map);
        }

        for (int i = 0; i < max; i++) {

            for (int j = 0; j < 5; j++) {
                if(list.get(j).get(i) != null){
                    bw.write(list.get(j).get(i));
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
