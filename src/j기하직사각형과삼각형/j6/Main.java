package j기하직사각형과삼각형.j6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        List<Integer> list = new ArrayList<>();

        int sum = 0;

        int count = 0;

        for (int i = 0; i < 3; i++) {

            int n = Integer.parseInt(br.readLine());

            sum += n;

            if(n == 60){
                count++;
            }

            if(list.contains(n)){
                list.removeAll(Collections.singleton(n));
            }else{
                list.add(n);
            }
        }

        if(sum != 180){
            System.out.println("Error");
        }else{
            if(count == 3){
                System.out.println("Equilateral");
            }else if(list.size() == 3){
                System.out.println("Scalene");
            }else{
                System.out.println("Isosceles");
            }
        }
    }
}
