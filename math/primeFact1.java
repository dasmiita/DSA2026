public class primeFact1 {
    //this version works but only prints each factor singular times it cant do 12 = 2x2x3
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
         for(int i = 2; i<=n;i++){
            if(n%i==0){
                if(check(i)){
                    System.out.print(i+" ");
                }
            }
         }

    }
    

    public static void main(String[] args) {
       // Systpfact(24));
       pfact(12);
        
    }
    
}
