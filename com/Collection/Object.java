package com.Collection;

class Car{
    String name;
    int age;

    Car(String name,int age){
        this.age=age;
        this.name=name;


    }
}
public class Object {

    public static void main(String[] args) {
        Car obj=new Car("Krishna",Integer.MAX_VALUE);
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

}
