public class checkForPrime1 {
    public static boolean prime (int n ){
        boolean check = true;
        if (n==1) check = false;
        if(n==2) check = true;
        for(int i = 2; i*i<n; i++){
            if(n%i==0){
                check = false;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println(prime(11));
    }
    
}
