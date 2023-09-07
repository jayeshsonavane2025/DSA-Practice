package CodeForces.basic;//package CodeForces.basic;
//
//import java.util.Scanner;
//
//public class WayTooLongWords {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String a[]=new String[n];
//        String temp;
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.next();
//
//        }
//        for (int i = 0; i < n; i++) {
//            if (a[i].length() > 10) {
//                int tempn = a[i].length();
//                char lastchar = a[i].charAt(tempn - 1);
//                char fchar = a[i].charAt(0);
//                temp = String.valueOf(fchar) + String.valueOf(tempn-2) + lastchar;
//                System.out.println(temp);
//            } else
//                System.out.println(a[i]);
//        }
//
//    }
//}

import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        while (n-- > 0) {
            String s = sc.nextLine();
            if (s.length() > 10) {
                System.out.println(s.charAt(0) + String.valueOf(s.length() - 2) + s.charAt(s.length() - 1));
            } else {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
