package com.oops1;

public class Static {
    int a=10;
        static void mul(){

            Static ob=new Static();
            System.out.println(ob.a);
    }

    public static void main(String[] args) {
        Static ob=new Static();
        ob.mul();
        System.out.println(ob.a);
    }
}
