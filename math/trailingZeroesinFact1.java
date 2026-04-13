public class trailingZeroesinFact1 {
    public static int trail(int n ){
        long f=1;
        for(int i = 1; i<=n;i++){
            f=f*i;    
            }
            int res=0;
            while(f%10==0){
            
                res++;
                System.out.println(" zero number " + res);
                f=f/10;
                
            }
            return res;
    }
    public static void main(String[] args){
        System.out.print(trail(5));
    }
}
