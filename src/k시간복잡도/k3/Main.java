package k시간복잡도.k3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        Long s = Long.parseLong(br.readLine());

        System.out.println(s*s);
        System.out.println(2);
    }
}
