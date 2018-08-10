package com.learning;

public class Conditions {
    /*
    Conditional Logic and Relational Operators
     */


    public  static  void  main(String[] args) {


        int v1 = 7;
        int v2 = 3;
        int vMax = v1 > v2 ? v1 : v2;// Conditional Assignment
      //  result=condition ? true-value : false-Value
        System.out.println(vMax);

        float students=40;
        float rooms=4;
        float studentsPerRoom=rooms==0.0f?0.0f:students/rooms;
        System.out.println(studentsPerRoom);
/*
Else if Statements
 */
        if (v1<v2)
            System.out.println("V1 is bigger");
        else
            System.out.println("V1 is NOT bigger");

    
    }
}
