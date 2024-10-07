package j기하직사각형과삼각형.j8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int max = Math.max(a, b);
        max = Math.max(max, c);

        int sum = a+b+c;

        int remain = sum-max;

        if(remain > max){
            System.out.println(sum);
        }else{
            System.out.println(2*(sum-max)-1);
        }
    }
}
