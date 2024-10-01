package j기하직사각형과삼각형.j3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        List<Integer> a = new ArrayList<>();

        List<Integer> b = new ArrayList<>();

        a.add(Integer.parseInt(stk.nextToken()));

        b.add(Integer.parseInt(stk.nextToken()));

        for (int i = 0; i < 2; i++) {

            stk = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(stk.nextToken());

            int y = Integer.parseInt(stk.nextToken());

            if(a.contains(x)){
                a.removeAll(Collections.singleton(x));
            }else{
                a.add(x);
            }

            if(b.contains(y)){
                b.removeAll(Collections.singleton(y));
            }else{
                b.add(y);
            }
        }

        System.out.println(a.get(0) + " " + b.get(0));
    }
}
