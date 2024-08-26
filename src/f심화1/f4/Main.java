package f심화1.f4;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        String[] split = s.split("");

        int length = split.length;

        int result = 1;

        for (int i = 0; i < length/2; i++) {

            if(!split[i].equals(split[length-i-1])){

                result = 0;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
