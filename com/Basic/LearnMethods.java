package methods;

public class LearnMethods {
    public static void main(String[] kucchBhi) {

//        for(String arg: kucchBhi) {
//            System.out.println(arg);
//        }


//        System.out.println(1);
//        System.out.println(2);
//        greet();
//        System.out.println(3);
//        System.out.println(4);

        int averageFromFunction = average(4, 6, true);
        int doubleOfAvg = averageFromFunction * 2;
        System.out.println("hello");
        System.out.println(doubleOfAvg);
    }

    static void greet() {
        System.out.println(5);
        System.out.println("Hello World");
        System.out.println(6);
    }

    public static int average(int a, int b, boolean shouldAverage) {
        if(shouldAverage == false) {
            return -1;
        }
        int avg = (a+b)/2;
        System.out.println("returning the avg");
        return avg;
    }

    static int minimum(int a, int b) {
        return a<b ? a: b;
    }

}
