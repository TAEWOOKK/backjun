package k시간복잡도.k5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int a = Integer.parseInt(br.readLine());

        long i = (long) a * a * a;
        System.out.println(i);
        System.out.println(3);
    }
}
