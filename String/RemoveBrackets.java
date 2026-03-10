package String;

import java.util.*;

public class RemoveBrackets {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextLine()){sc.close();return ;}

        String res = "" ;
        String s = sc.nextLine();

        List<Character> arr = Arrays.asList('(',')','[',']','{','}');

        for(char c : s.toCharArray()){
            if(!arr.contains(c)){
res +=c;

            }
        }

        System.out.println("After removing Brakets : "+res);



        sc.close();
        

    }
    
}
