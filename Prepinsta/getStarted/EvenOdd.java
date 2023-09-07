package Prepinsta.getStarted;

public class EvenOdd {
    public static void main(String[] args) {
        int n=-2;
        isEvenOdd(n);
        isEvenOddUsingBit(n);

    }

    private static void isEvenOddUsingBit(int n) {
        if((n&1)==0)
            System.out.println(n+" is Even");
        else
            System.out.println(n+" is Odd");
    }

    private static void isEvenOdd(int n) {
        if(n%2==0)
            System.out.println(n+" is Even");
        else
            System.out.println(n+" is Odd");
    }

}
