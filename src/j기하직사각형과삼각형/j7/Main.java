package j기하직사각형과삼각형.j7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0 && b == 0 && c == 0){
                break;
            }

            int max = Math.max(a, b);
            max = Math.max(c,max);

            if(a+b+c-max<=max){
                bw.write("Invalid");
            }else{

                if(a==b && b==c){
                    bw.write("Equilateral");
                }else{

                    List<Integer> list = new ArrayList<Integer>();

                    list.add(a);

                    if(list.contains(b)){
                        list.removeAll(Collections.singleton(b));
                    }else{
                        list.add(b);
                    }

                    if(list.contains(c)){
                        list.removeAll(Collections.singleton(c));
                    }else {
                        list.add(c);
                    }

                    if(list.size() == 1){
                        bw.write("Isosceles");
                    }else{
                        bw.write("Scalene");
                    }
                }
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
