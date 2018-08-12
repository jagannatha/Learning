package com.learning;

public class Arrays {
    public  static  void  main(String [] args){
        float []jagan={100.0f,150.0f,200.0f};
        float sum=0.0f;
        for (int i=0; i<jagan.length;i++)
            sum +=jagan[i];
        System.out.println(sum);

    }
}
