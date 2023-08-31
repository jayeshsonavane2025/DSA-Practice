package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Time {
    public static void main(String[] args) {

       //int res= josephus(14,2);

        // int res=nCr(5,3);

        //boolean res=isPalindrome("rammar");

        int count=countOcuu("radheradhera","radhe");
        //System.out.println(count);

        //printSubString("ram");
        //System.out.println(findSubstrings("ram"));
        int res=countUniquePaths(2,3);
        System.out.println(res);

    }

    private static int countUniquePaths(int i, int j) {
        return coutnUniquePathHelper(1,1,i,j);
    }

    private static int coutnUniquePathHelper(int i, int j, int n, int m) {
        if(i>n || j>m)return 0;
        if(i==n && j== m)return 1;
        return coutnUniquePathHelper(i+1,j,n,m)+coutnUniquePathHelper(i,j+1,n,m);
    }

    //Print Substring for arraylist
    public static List<String> findSubstrings(String s) {
        //You can code here
        ArrayList<String> list=new ArrayList<>();
        findSubStringHelper(s,"",0,list);
        Collections.sort(list);
        list.remove(0);
        return list;

    }

    private static void findSubStringHelper(String str, String sub, int i, List<String> list) {

        if(i==str.length()){
            list.add(sub);
            return;

        }
        findSubStringHelper(str,sub+str.charAt(i),i+1,list);
        findSubStringHelper(str,sub ,i+1,list);

    }



    //Print Substring
    private static void printSubString(String str) {
        printSubStringHelper(str,0,"");
    }

    private static void printSubStringHelper(String str, int i, String s) {
        if(i==str.length()){
            System.out.println(s);
            return;
        }

        printSubStringHelper(str,i+1,s+str.charAt(i));
        printSubStringHelper(str,i+1,s);

    }




    //Count occurences of substring in strinf
    private static int countOcuu(String str, String sub) {
        return countOccurHelper(str,sub,0);
    }
    private static int countOccurHelper(String str, String sub, int i) {
        if(i>str.length()-sub.length())return 0;
        int subProblemKaAnswer=countOccurHelper(str,sub,i+1);
        boolean doesStartCharMatch= str.substring(i,i+sub.length()).equals(sub);
        if(doesStartCharMatch)return subProblemKaAnswer+1;
        return subProblemKaAnswer;
    }


    //TO CHECK PALINDROME
    private static boolean isPalindrome(String str) {
        return isPalindromeHelper(str,0,str.length()-1);
    }

    private static boolean isPalindromeHelper(String str, int l, int r) {
        if(l<=r)return true;
        if(str.charAt(l) == str.charAt(r))
            return isPalindromeHelper(str,l+1,r-1);
        return false;

    }

    //nCr Using Recursion
    public static  int nCr(int n,int r){
        if(n<r)return 0;
        if(n==r || r==0)return 1;
        if(r==1)return n;
        return nCr(n-1,r-1)+nCr(n-1,r);
    }




    //Josephus Problem
    public static  int josephus(int n,int k){

        if(n==1)return 1;
        return (josephus(n-1,k)+k-1)%n+1 ;
    }



}
