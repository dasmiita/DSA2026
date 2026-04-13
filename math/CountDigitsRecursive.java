public class CountDigitsRecursive {
    public static int count(int n){
     if(n/10==0) return 1;
     return 1+count(n/10);
    }
    public static int countUsingLog(int n){
        return (int)Math.floor(Math.log10(n)+1);
    }
    public static void main(String[] args){
        int n = 343434;
        System.out.println(countUsingLog(n));
        System.out.println(count(n));
    }
    
}
