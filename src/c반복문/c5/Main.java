package c반복문.c5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt()/4;

        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if(i == n){
                builder.append("long int");
            }else{
                builder.append("long ");
            }
        }

        System.out.println(builder);
    }
}
