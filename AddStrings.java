class AddStrings{
    public static String addString(String num1 , String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;

        while(i >= 0 || j >= 0){
            int x = (i>=0)? num1.charAt(i)-'0':0;
            int y = (j>=0)? num2.charAt(j)-'0':0;

            int sum = x+y+carry;

            res.append(sum%10);
            carry = sum/10;

            i--;j--;
        }

        if(carry!=0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
    public static void main(String[] args) {

        String num1 = "999";
        String num2 = "101";

        System.out.println( num1 +" + "+num2 + " =  "+addString(num1, num2));
        
    }
}