public class gcd1 {
    public static int gcd( int a, int b){
        int div = 0;
        int c = 0; 
        if (a<b) c=a;
        else c=b;
        for(int i = 1; i<=c;i++){
            if(a%i==0 && b%i==0){
                div = i;
            } 
        }
        return div; 
    }
    public static void main(String[] args) {
        System.out.println(gcd(100,200));
    }
    
}
