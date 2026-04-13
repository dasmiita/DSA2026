public class trailingZeroesFact2 {
    public static int trail(int n ){
        int res = 0;
        for(int i = 5; i<=n;i*=5){
            res+=n/i;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(trail(100));
    }
    
}
