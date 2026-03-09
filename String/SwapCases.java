package String;

public class SwapCases {


    static String SwapLetters(String s){

        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                res.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
                res.append(Character.toUpperCase(c));
            }
            else{
                res.append(c);
            }
        }
        return res.toString();

    }


    public static void main(String[] args) {
        String s1 = "Yash Ajay Kadav 12 03 2004";

        System.out.println(SwapLetters(s1));
    }
    
}
