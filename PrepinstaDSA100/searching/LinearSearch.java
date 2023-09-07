package PrepinstaDSA100.searching;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class LinearSearch {
    static Scanner sc=new Scanner(System.in);
    static int[] a;

    public static void main(String[] args) {
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=sc.nextInt();

        }
        System.out.println("Enter kry to be searched");
        int key=sc.nextInt();
        linearSearch(a,key);
    }

    private static void linearSearch(int[] a, int key) {
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==key){
                System.out.println(key+" found at "+i);
                return;

            }



        }
        System.out.println(key+" not found in array");
    }

}
