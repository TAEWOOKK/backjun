package d1차원_배열.d7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[31];

        arr[0] = true;

        for (int i = 1; i < 29; i++) {

            int a = Integer.parseInt(br.readLine());

            arr[a] = true;
        }

        br.close();

        for(int i = 0; i < 31; i++){

            if(!arr[i]){
                bw.write(i + " ");
            }
        }

        bw.flush();
        bw.close();
    }
}
