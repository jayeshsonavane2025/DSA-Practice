package com.Wrapper;

public class Generic {
    public static void main(String[] args) {
        Human<String> ob=new Human<>("Vrindavan");

        printData("1234");
    }
    private static <Name extends String> void printData(Name name){
        System.out.println(name);
    }
    private static <Name > void doubleData(Name name){
        System.out.println(name);
    }


}
class Human<Golok>{
    Golok dham;
    public Human(Golok dham){
        this.dham=dham;
        System.out.println(dham);

    }



}
