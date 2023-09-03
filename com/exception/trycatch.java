package com.exception;

public class trycatch {
    public static void main(String[] args) {

        Helper.Print(new String[]{"Krishna","Radha","RadhaVallabh",});

    }
}
class Helper{
    public static void Print(String[] naam){


      try {
          for(String name:naam){
              System.out.println(name);
          }
          System.out.println(naam[naam.length]);
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Arrays Out of bound");
      }
        System.out.println(naam[0]);
    }
}
