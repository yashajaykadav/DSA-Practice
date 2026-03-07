public class SubstarctStrings {

    public static String SubstractString(String num1,String num2){

        StringBuilder res = new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int borrow = 0;
        
        if(j>i)return "second number is greater that first";

        while(i>=0){
            int x = num1.charAt(i)-'0';
            int y = (j>=0)?num2.charAt(j)-'0':0;

            int sub = x-y-borrow;

            if(sub<0){
                sub+=10;
                borrow = 1;
            }else{
                borrow = 0;
            }
            res.append(sub);
            i--;j--;

        }

        while(res.length()>1 && res.charAt(res.length()-1)=='0'){
res.setLength(res.length()-1);
        }

        return res.reverse().toString();
    }



    public static void main(String[] args) {

        String num1 = "200";
        String num2 = "50";
        String res = SubstractString(num1,num2);

        System.out.println(num1+" + "+ num2+" = "+res );
        
    }
    
}
