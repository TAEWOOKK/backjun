package f심화1.f6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] words = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String s = br.readLine();

        List<String> list = new ArrayList<>();

        list.add(s);

        for (String word : words) {

            List<String> exlist = new ArrayList<>();

            for(String text : list){

                int count = 0;
                int index = 0;

                if(!text.equals("dz=")){
                    while ((index = text.indexOf(word, index)) != -1) {
                        count++;
                        index += word.length();
                    }

                    for (int i = 0; i < count; i++) {

                        exlist.add(word);
                    }

                    String[] split = text.split(word);

                    exlist.addAll(List.of(split));
                }else{
                    exlist.add(text);
                }
            }
            list = exlist;
        }

        List<String> words1 = List.of(words);

        for(int i = 0; i < list.size(); i++){

            String s1 = list.get(i);

            boolean equals = s1.equals("");


            if (equals){
                list.remove(i);
            }
        }

        List<String> dummy = new ArrayList<>();

        int size = list.size();

        for (int i = 0; i < size; i++) {

            String word = list.get(i);

            boolean contains = words1.contains(word);

            if(!contains){

                String[] split = word.split("");

                list.addAll(List.of(split));
                dummy.add(word);
            }
        }

        for (String word : dummy) {

            int i = list.indexOf(word);

            list.remove(i);
        }
        bw.write(String.valueOf(list.size()));
        bw.flush();
        bw.close();
    }
}
