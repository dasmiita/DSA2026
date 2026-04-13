//first self trial - brute force 
import java.util.Scanner;
public class palindromeNumber1 {
    public static int rev(int n){
        int r = 0;
        while(n!=0)
{ int dig = n%10;
    r=r*10+dig;
    n=n/10;
}        return r;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = rev(n);
        boolean check=false;
        if(r==n) check=true;
        System.out.println(check);

    }
}
