package String;

import java.util.*;

public class CheckAnagram {

    public static boolean isAnagram2(String s1,String s2){

        if(s1.length()!= s2.length())return false;
            Map<Character,Integer> map = new HashMap<>();

            for(char c : s1.toCharArray() ){
                map.put(c,map.getOrDefault(c,0)+1);
            }

            for(char c : s2.toCharArray()){
                if(!map.containsKey(c)){
                    return false;
                }
                map.put(c, map.get(c)-1);

                if(map.get(c)==0){
                    map.remove(c);
                }
            }

            if(map.size()>0){
                return false;
            }else{
return true;            }
    }

    public static boolean isAngram1(String s1 , String s2){
        
        
        if(s1.length()!= s2.length())return false;

        char[] chars1 = s1.toLowerCase().toCharArray();
        char[] chars2 = s2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);
    
        return Arrays.equals(chars1, chars2);
            
    }

    public static void main(String[] args) {

        String s1 = "tea";
        String s2 = "eat";

        boolean res1 = isAngram1(s1,s2);
       boolean res =  isAnagram2(s1,s2);
       if(res && res1){
                    System.out.println("Its Anagram Broo!");

       }else{
                    System.out.println("Nah bro Not!");

       }
        
    }
    
}
