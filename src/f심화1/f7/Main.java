package f심화1.f7;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int s = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < s; i++) {

            String s1 = br.readLine();

            List<String> split = List.of(s1.split(""));

            boolean groupCheck = true;

            for (String word : split){

                int frequency = Collections.frequency(split, word);

                if (frequency > 1){

                    boolean noGroupCheck = false;

                    for (int j = 0; j < split.size(); j++) {

                        if(j==0 && split.get(j).equals(word)){

                            if(!split.get(j+1).equals(word)){
                                noGroupCheck = true;
                            }
                        }

                        if(j > 0 && split.get(j).equals(word) && !split.get(j-1).equals(word)){

                            if(j+1<split.size() && !split.get(j+1).equals(word)){

                                noGroupCheck = true;
                            }else if(j+1>=split.size()){
                                noGroupCheck = true;
                            }
                        }

                    }
                    if(noGroupCheck){
                        groupCheck = false;
                    }
                }
            }

            if (groupCheck){
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
