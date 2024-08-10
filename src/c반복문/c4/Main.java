package c반복문.c4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int m = sc.nextInt();

        int t = 0;

        for (int i = 1; i <= m; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            t += a*b;
        }

        if(n == t){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
