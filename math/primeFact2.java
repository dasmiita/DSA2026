public class primeFact2 {
        public static boolean check (int n){
        boolean c = true;
        if(n==1) c = false;
        if(n==2 || n==3) c = true;
        for(int i = 2; i*i<=n;i++){
             if(n%i==0) {
                c=false;
             }

        }
        return c;
    }
     public static void pfact(int n){
        for(int i = 2; i<n;i++){
            if(check(i)){
                int x =i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x=x*i;
                }
            }
        }
     }

    public static void main(String[] args) {
        pfact(12);
    }
    
}
