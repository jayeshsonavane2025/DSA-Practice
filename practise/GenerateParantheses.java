package practise;

public class GenerateParantheses {
    public static void main(String[] args) {
        int n=3;
        generateParanthesis("",n,0,0,0);
    }

    private static void generateParanthesis(String s, int n, int i, int open, int close) {
        if(i==2*n){
            System.out.println(s);
        }
        else{
            if(open<n){
                s=s+"(";
                generateParanthesis(s,n,i+1,open+1,close);
                s=s.substring(0,s.length()-1);
            }
            if(close<open){
                s=s+")";
                generateParanthesis(s,n,i+1,open,close+1);
                s=s.substring(0,s.length()-1);
            }
        }
    }
}
