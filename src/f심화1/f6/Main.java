package f심화1.f6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] words = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String s = br.readLine();

        List<String> list = new ArrayList<>();

        list.add(s);

        for (String word : words) {



        }

        String[] split = s.split("c=");


        for(String word : split) {

            System.out.println(word);
        }
    }
}
