package j기하직사각형과삼각형.j5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int maxx = n;
        int minx = n;
        int maxy = m;
        int miny = m;

        for (int i = 0; i < l-1; i++) {

            stk = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(stk.nextToken());

            int b = Integer.parseInt(stk.nextToken());

            maxx = Math.max(maxx, a);
            minx = Math.min(minx, a);
            maxy = Math.max(maxy, b);
            miny = Math.min(miny, b);
        }
        System.out.println((maxx-minx)*(maxy-miny));
    }
}
