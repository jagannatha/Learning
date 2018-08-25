package com.learning;

import java.util.Scanner;

public class Arrayassignment2 {

    public static  void main(String [] args){
        Scanner reader=new Scanner(System.in);
        String [] jobs=new String[5];
        int [] Numbers=new int[10];
//        jobs[0]="Jaganntha";
//        jobs[1]="Developer";
//        jobs[2]="QA Engineer";
//        jobs[3]="SDET";
//        jobs[4]="Vismaya";

        System.out.println("Enter the Job Name:");
for(int i=0;i<5;i++)
    jobs[i]=reader.nextLine();
        System.out.println("Enter the Numbers:");
for (int j=0;j<10;j++)
Numbers[j]=reader.nextInt();

//        for(int i=0;i<5;i++){
//            System.out.println(jobs[i]);
//        }

    }
}
