package com.exception;

import java.util.Scanner;

public class ThrowAndThrows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        try {
            int age = sc.nextInt();
            if (age > 100) {
                throw new ArithmeticException("Greater than 100");
            }
        } catch (Exception var3) {
            System.out.println(var3);
        }

    }

}
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
