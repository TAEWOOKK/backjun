package j기하직사각형과삼각형.j2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());

        int y = Integer.parseInt(st.nextToken());

        int w = Integer.parseInt(st.nextToken())-x;

        int h = Integer.parseInt(st.nextToken())-y;

        int c = Math.min(Math.min(x, w), Math.min(y, h));

        System.out.println(c);
    }
}
