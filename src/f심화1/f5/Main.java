package f심화1.f5;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toUpperCase();

        String[] words = s.split("");

        List<String> wordList = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {

            if(!wordList.contains(words[i])) {

                wordList.add(words[i]);
            }
        }

        List<Integer> countList = new ArrayList<>();

        for (String word : wordList) {

            int frequency = Collections.frequency(List.of(words), word);

            countList.add(frequency);

        }

        int max = Collections.max(countList);

        int frequency = Collections.frequency(countList, max);

        if (frequency > 1) {
            bw.write("?");
        }else{

            int index = countList.indexOf(max);

            bw.write(wordList.get(index));
        }

        bw.flush();
        bw.close();
    }
}
