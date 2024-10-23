package l브루트포스.l1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        String[] array = br.readLine().split(" ");

        int[] arr = Arrays.stream(array)
                .mapToInt(Integer::parseInt)
                .toArray();

        int cha = 1000000;

        int result = 0;

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {

                    int sum = arr[i] + arr[j] + arr[k];

                    if(Math.abs(sum - m) < cha && sum <= m){

                        result = sum;

                        cha = Math.abs(sum - m);
                    }
                }
            }
        }

        System.out.println(result);
    }
}
