package d1차원_배열.d8;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {

            int a = Integer.parseInt(br.readLine())%42;

            if(!arr.contains(a)) {
                arr.add(a);
            }
        }
        br.close();
        bw.write(String.valueOf(arr.size()));
        bw.flush();
        bw.close();
    }
}
