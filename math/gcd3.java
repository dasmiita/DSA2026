public class gcd3 { 
    //euclid theorem and modular division
    public static int gcd(int a, int b ){

        while(a!=b){
            if(a>b) a = a-b;
            else  b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(gcd(78,45));
        
    }
    
}
