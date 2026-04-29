//package dsa-self.recursion;

public class rec1 {
    static void fun(int n){
        if(n==0) return;
        System.out.println("Doing recursions! Wish me Luck");
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(3);
    }
    
}
