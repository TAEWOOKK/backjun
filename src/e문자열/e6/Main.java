package e문자열.e6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {

            String one = s.substring(i, i + 1);

            if(!list.contains(one)) {

                list.add(one);
            }else{
                list.add("due");
            }
        }

        String[] arr = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

        for (int i = 0; i < arr.length; i++) {

            if(list.contains(arr[i])) {

                arr[i] = String.valueOf(list.indexOf(arr[i]));
            }else{
                arr[i] = "-1";
            }

            bw.write(arr[i]+" ");
        }

        bw.flush();
        bw.close();
    }
}
