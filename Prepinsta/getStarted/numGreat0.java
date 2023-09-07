package Prepinsta.getStarted;

import java.sql.SQLOutput;
import java.util.Scanner;

public class numGreat0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.println("DEnter number");
//        int n=sc.nextInt();
        int n=-1;
        numGreat0(n);
        numGreatZero1(n);



    }
    //method to check num greater than 0
    public static void numGreat0(int n){
        if(n==0) System.out.println("Number is zero");
        else if (n>0) {
            System.out.println("Number is Positive");

        }
        else System.out.println("Number is negative");
    }
    public static void numGreatZero1(int n){
         String res=n!= 0 ?n>0?"Number is Positive":"Number is negative":"Number is zero";
        System.out.println(res);
    }

}
