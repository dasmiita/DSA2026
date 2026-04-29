//package dsa-self.recursion;
//print n to 1; 
public class rec2 {
    static void fun(int n){
        if(n==0)return;
        System.out.println(n);
        fun(n-1);
    }
    public static void main(String[] args) {
        fun(10);
    }
    
}
