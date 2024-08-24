package e문자열.e9;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();

        String b = st.nextToken();

        String[] arr1 = a.split("");
        String[] arr2 = b.split("");

        StringBuilder newa = new StringBuilder();
        StringBuilder newb = new StringBuilder();

        for (int i = 2; i >= 0; i--) {

            newa.append(arr1[i]);
            newb.append(arr2[i]);
        }

        int ra = Integer.parseInt(newa.toString());
        int rb = Integer.parseInt(newb.toString());

        if (ra > rb) {
            bw.write(String.valueOf(ra));
        }else{
            bw.write(String.valueOf(rb));
        }

        bw.flush();
        bw.close();
    }
}
