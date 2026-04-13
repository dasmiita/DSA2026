public class palindromeNumber2 {
    public static boolean rev(int n){
        String str = Integer.toString(Math.abs(n));
       // String reverse=""
        // int l = 0;
        // int r = str.length()-1;
        // while(l<r){
        //     char temp = str.charAt(l);
        //     str.charAt(l)=str.charAt(r);
        //     str.charAt(r)=temp;
        //     l++;
        //     r--;

        for(int i=0; i<(str.length())/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
        }
        public static void main(String[] args){
            int n = 111;
            System.out.println(rev(n));
        }

    
}
