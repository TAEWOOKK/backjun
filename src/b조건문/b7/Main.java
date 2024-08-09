package b조건문.b7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && b == c){
            System.out.println(a*1000+10000);
        } else if (a == c) {
            System.out.println(a*100+1000);
        } else if (a == b) {
            System.out.println(a*100+1000);
        } else if (b == c) {
            System.out.println(b*100+1000);
        }else{
            if(a>b){
                if(a>c){
                    System.out.println(a*100);
                }else{
                    System.out.println(c*100);
                }
            }else{
                if(b>c){
                    System.out.println(b*100);
                }else{
                    System.out.println(c*100);
                }
            }
        }
    }
}
