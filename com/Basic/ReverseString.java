package com.Basic;

public class ReverseString {
    public static void main(String[] args) {
        Solution.reverseStringUsingArray("Radhe");
    }


}
class Solution{
    public static void reverseStringUsingArray(String s){
        char[] carr=s.toCharArray();
        int start=0,end=carr.length-1;
        while(start < end){
            char temp=carr[start];
            carr[start]=carr[end];
            carr[end]=temp;
            start++;
            end--;

        }
        System.out.println(String.valueOf(carr));
        System.out.println(new String(carr));

    }
}

