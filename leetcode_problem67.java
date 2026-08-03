public class leetcode_problem67 {
    public static void main(String[] args) {
        String a = "11010";
        String b = "11";
        System.out.println(a);
        System.out.println(b);
        while(a.length() != b.length()){
            if(a.length()<b.length()){
                a = fa(a,b);
            }
            else{
                b = fb(a,b);
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
    public static String fa(String a, String b){
       int zero = b.length() - a.length();
       for(int i = 0; i < zero; i++){
           a = "0" + a;
        }
        return a;
    }
 
    public static String fb(String a, String b){
       int zero = a.length() - b.length();
       for(int i = 0; i < zero; i++){
           b = "0" + b;
       }
       return b;
    }
}