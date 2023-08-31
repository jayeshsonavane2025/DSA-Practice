package oops;

public class constructor {

    String name,color;
    int a,b;



    public static void main(String[] args) {

        constructor obj1=new constructor(10,20);
        constructor obj2=new constructor(30,40);
        constructor ob3= obj1.add(obj2);
        ob3.add();



    }

    private constructor add(constructor obj2) {
        return new constructor(this.a+obj2.a,this.b+ obj2.b);
    }

        constructor(){
        this(12,13);
        this.color="red";
        this.name="Gay";
        bark();motion();
        }
        constructor(int a,int b){
        this.a=a;
        this.b=b;
        //add();

        }
        void add(){
            System.out.println("sum is"+(a+b));
        }


    void bark() {
        System.out.println(name + " Barking");
    }

     void motion(){
            System.out.println(name+" Moving");

    }

}

