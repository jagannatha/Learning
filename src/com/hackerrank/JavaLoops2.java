package com.hackerrank;

import java.util.Scanner;

public class JavaLoops2 {
    /*
    We use a=0, b=2 and n=10 to produces s0,s1,s2,s3,-------sn-1
    s0=0+1*2=2
    s1=0+1*2+2*2=6
    s2=0+1*2+2*2+3*2=12
     */
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = 10;

            for(int j=0;j<n;j++)
            {
                a+=(Math.pow(2,j)*b);
                System.out.print(a+" ");
            }

        }

        in.close();
    }
}
