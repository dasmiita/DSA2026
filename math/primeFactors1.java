public class primeFactors1 {
    public static boolean check(int n ){
        for(int i = 2; i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void fact(int n){
        for(int i = 1; i<=n;i++){
            if(n%i==0){
                if(check(i)){
                    System.out.println(i + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(fact(24));
    }
    
}
