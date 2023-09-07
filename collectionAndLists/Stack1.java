package collectionAndLists;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<String> st=new Stack<>();

        st.push("Radha");
        st.push("Madhav");
        st.push("RadhaRaman");

        System.out.println(st);

        st.pop();

        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.isEmpty());

        System.out.println(st.empty());


    }

}
