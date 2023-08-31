package com.oops1;

class Complex {
    int a;
    int b;

    public Complex(int real) {
        this(real, 12);
    }

    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void print() {
        System.out.println(this.a + " + " + this.b + "i");
    }

    Complex add(Complex num2) {
        System.out.println(this);
        this.print();
        num2.print();
        return new Complex(this.a + num2.a, this.b + num2.b);
    }
}
