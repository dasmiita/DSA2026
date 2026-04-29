public class palindromeNumber2 {
    public static boolean rev(int n){
        String str = Integer.toString(Math.abs(n));
      

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
