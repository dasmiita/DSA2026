import java.util.*;
public class seive2 {
    public static void sieve(int n)
{ 
     boolean[] prime = new boolean[n+1];
     for(int i =0; i<=n;i++){
        prime[i] = true;
     }
     prime[0]=false;
     prime[1]=false;
    for(int p = 2; p*p<=n;p++)
    {
        if(prime[p]){
            for(int i=p*p;i<=n;i+=p){
                prime[i] = false;

            }
        }
        else { continue; 

        }
    
    }

    int count = 0; 
    for(int i = 0; i<=n;i++){
        if(prime[i]) count++;
    } 
    int[] res = new int[count];
    int idx=0;
    for(int i = 2; i<=n;i++){
        if(prime[i])  res[idx++]=i;
    }
    for(int x: res){
        System.out.print(x+" ");
    }

}
  public static void main(String[] args){
        int n =100;
    sieve(n);

    }
    
}
