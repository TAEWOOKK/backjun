package h일반수학1.h4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int s = Integer.parseInt(br.readLine());

        System.out.println((int) Math.pow(1+Math.pow(2,s),2));
    }
}
