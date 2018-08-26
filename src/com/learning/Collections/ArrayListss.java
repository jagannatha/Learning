package com.learning.Collections;

import java.util.ArrayList;

public class ArrayListss {
    public  static  void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Dev");
        al.add("QA");
        al.add("Kaga");
       // System.out.println(al.remove(2));

for (String st:al)
    System.out.println(st);


ArrayList<employee> emp=new ArrayList<employee>();
emp.add(new employee( "jagannatha",27));
for (employee sp:emp)
System.out.println("The age of Employee is:"+ sp.age);

    }


static class employee{
        String name;
        int age;

        public employee(String name,int age){
            this.name=name;
            this.age=age;
        }

}
    }
