public class CountDigitsRecursive {
    public static int count(int n){
     if(n/10==0) return 1;
     return 1+count(n/10);
    }
    public 
    public static void main(String[] args){
        int n = 343434;
        System.out.println(count(n));
    }
    
}
