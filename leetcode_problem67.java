class leetcode_problem67 {
    public static void main(String[] args){
        String a = "0010";
        String b = "1101";
        while(a.length() != b.length()){
            if(a.length() > b.length()){
                b = fb(a,b);
            }if(b.length() > a.length()){
                a = fa(a,b);
            }
        }
        System.out.print(additionOfBinary(a,b));
    }
    // Function for incerase the charecters in a.
    public static String fa(String a, String b) {
        int zero = b.length() - a.length();
        for(int i = 0; i < zero; i++){
            a = "0" + a;
        }
        return a;
    }
    // Function for incerase the charecters in b.
    public static String fb(String a, String b) {
        int zero = a.length() - b.length();
        for(int i = 0; i < zero; i++){
            b = "0" + b;
        }
        return b;
    }
    // Adding the charecters in sequece.
    public static String additionOfBinary(String a, String b){
        char carry = '0';
        String ans = "";
        for(int i = a.length() -1; i >= 0; i--){
            if(a.charAt(i) == '0' && b.charAt(i) == '0'){
                if(carry == '1'){
                    ans = "1" + ans;
                    carry = '0';
                }
                else{
                    ans = "0" + ans;
                    carry = '0';
                }
            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '0'){
                if(carry == '1'){
                    ans = "0" + ans;
                    carry = '1';
                }
                else{
                    ans = "1" + ans;
                    carry = '0';
                }
            }
            else if(a.charAt(i) == '0' && b.charAt(i) == '1'){
                if(carry == '1'){
                    ans = "0" + ans;
                    carry = '1';
                }
                else{
                    ans = "1" + ans;
                    carry = '0';
                }
            }
            else if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(carry == '1'){
                    ans = "1" + ans;
                    carry = '1';
                }
                else{
                    ans = "0" + ans;
                    carry = '1';
                }
            }
        }
        // if carry remain then here we can solve that.
        if(carry == '1'){
            ans = carry + ans;
        }else{
            ans = ans;
        }
        return ans;
    }
}