package com.learning;

public class NestedForloop {
    void draw(){
        for(int i=0;i<10;i++)
        {
                System.out.println("*");
            for(int j=i;j>=0;j--)
            System.out.print("-");
        }

    }
    public static void main (String[] args){
//Using Functions
        new NestedForloop().draw();
        new NestedForloop().draw();
        new NestedForloop().draw();
        new NestedForloop().draw();
        new NestedForloop().draw();
        new NestedForloop().draw();

//   Using Nedted For loop
//        for(int i=0;i<10;i++)
//        {
//                System.out.println("*");
//            for(int j=i;j>=0;j--)
//            System.out.print("-");
//        }
    }
}
