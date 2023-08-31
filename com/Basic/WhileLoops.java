package loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        boolean hasLearnt = false;
//        while(!hasLearnt) {
//            System.out.println("Went to school, tried to learn");
//            System.out.println("Have you understood?");
//            hasLearnt = sc.nextBoolean();
//        }

        int i = 8;
//        while(i<=5) {
//            System.out.println(i);
//            i++;
//        }

        do {
            System.out.println(i);
            i++;
        } while(i <= 5);

        System.out.println("out of the loop");
    }
}
