public class lcm1 {
   
    public static int lcm(int a, int b){
        int id = Math.max(a, b);
        while(a!=0){
            if(id%a==0 && id%b==0){
                break;
            }
            else{
                id++;
            }
        }
        return id;
    }
     public static void main(String[] args){
        System.out.println(lcm(3, 8));
    }

    
}
