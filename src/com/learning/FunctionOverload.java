package com.learning;

public class FunctionOverload {
    float Sub(float n1,float n2){
        float r=n1+n2;
        return  r;
    }
    float Sub(float n1,float n2,float n3){
        float r=n1-n2-n3;
        return  r;
    }

    public static  void  main(String[] args){
        float s1=new  FunctionOverload().Sub(10,4);
        float s2=new  FunctionOverload().Sub(10,3,3);
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
    }
}
