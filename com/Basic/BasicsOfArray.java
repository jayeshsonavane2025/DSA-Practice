package arrays;

public class BasicsOfArray {
    public static void main(String[] args) {
//        int age[]; //declaration
//        age = new int[5]; //allocation

//        int age[] = new int[5];
//
//        age[0] = 5;
//        age[1] = 2;
//
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]);
//
//        System.out.println(age.length);

//        int marks[] = {98, 12, 45, 12, 65};
//
//        System.out.println(marks[4]);


        String names[] = {"Ram", "Harish", "Karan", "Monty"};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is "+names[i]);
        }

        for(String name: names) {
            System.out.println("for each "+name);
        }

    }
}
