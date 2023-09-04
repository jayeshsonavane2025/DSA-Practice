package com.oops1;

import java.util.Scanner;

public class HeapStack {
    static Scanner obj =new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        takeinput(sc);
    }
    static void takeinput(Scanner sc){
        System.out.println("Enter Your Sakha Name");
        //String res=sc.next();
        String res=HeapStack.obj.next();
        System.out.println("Your Sakha : "+res);
    }
}
