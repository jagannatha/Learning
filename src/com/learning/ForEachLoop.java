package com.learning;

public class ForEachLoop {
    public  static  void main(String [] args){
        /*
        For eachloop or enhanced for loop
        Executes a statement one for each member in an array
        Handles getting collection length
        Handles accessing each value
     Syntax:   for(loop-variable declaration:array)
        statement;

         */

        float[] values={10.0f,20.0f,30.0f};
        float sum=0.0f;
        for(float currentVal:values)
            sum+=currentVal;
        System.out.println(sum);

    }
}
