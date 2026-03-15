public class SubSequenceString {


    public static boolean isSubSquence(String s1 , String s2){
        int i = 0;
        int j = 0;

        while (i<s1.length()&& j < s2.length()) {

            if(s1.charAt(i) ==s2.charAt(j)){
                i++;
            }
            j++;
        }

        return i == s1.length();
    }

    public static void main(String[] args) {
        
        String s2 = "acppraduman";
        String s1 = "pradum";


        boolean res = isSubSquence(s1, s2);

        System.out.println("result = "+res);



    }
    
}
