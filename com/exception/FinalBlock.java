package com.exception;

public class FinalBlock {
    public static void main(String[] args) {
        int[] a=new int[5];
        System.out.println("Radhe Radhe");
        try {
            System.out.println(a[8]);

        }catch(Exception e){
            System.out.println("Handelling Exception");

        }finally {
            System.out.println("Finally Block Executed");
        }
    }
}
