package d1차원_배열.d10;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        double m =0;

        StringTokenizer stk = new StringTokenizer(br.readLine());

        double[]arr = new double[n];

        for (int i = 0; i < n; i++) {

            arr[i] = Integer.parseInt(stk.nextToken());

            if(arr[i]>m){
                m=arr[i];
            }
        }

        double sum = 0;
        for(int i=0;i<n;i++){

            arr[i] = arr[i]/m*100;

            sum += arr[i];
        }

        br.close();
        bw.write(String.valueOf(sum/n));
        bw.flush();
        bw.close();
    }
}
