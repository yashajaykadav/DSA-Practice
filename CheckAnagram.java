import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 

public class CheckAnagram {

    public static boolean checkAnagram(String s1 , String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1!=n2)return false;
       
         Map<Character,Integer> map = new HashMap<>();

         for(Character c : s1.toLowerCase().toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
         }

         for(Character c : s2.toLowerCase().toCharArray()){
            
            if(!map.containsKey(c))return false;
            
            map.put(c, map.get(c)-1);

            if(map.get(c) == 0)map.remove(c);
            
                        }
            if(map.size()>0)return false;
        
        return true;

    }

    public static boolean isAnagramSimple(String s1, String s2) {
    if (s1.length() != s2.length()) return false;

    // Use toLowerCase() so "Listen" matches "Silent"
    char[] charArray1 = s1.toLowerCase().toCharArray();
    char[] charArray2 = s2.toLowerCase().toCharArray();

    // Use java.util.Arrays explicitly to avoid "cannot be resolved" errors
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    return Arrays.equals(charArray1, charArray2);
}

public static boolean isAngram(String s1,String s2){

    if(s1.length()!=s2.length())return false;

    int[] counts = new int[26];
    
    for(int i = 0 ; i < s1.length();i++){
        counts[s1.charAt(i)-'a']++;
        counts[s2.charAt(i)-'a']--;
    }


    return Arrays.stream(counts).allMatch(v->v==0);
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First String");
        String s1 = sc.nextLine();

        System.out.println("Enter Second String");
        String s2 = sc.nextLine();

       if(checkAnagram(s1,s2)&& isAnagramSimple(s1,s2)&&isAngram(s1, s2)){
        System.out.println("its Anagram, Bro!");
       }
       else{
        System.out.println("No Bro! Not Anagram");
       }

        sc.close();
    }
    
}
