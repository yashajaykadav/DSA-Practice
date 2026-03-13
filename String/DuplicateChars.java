
import java.util.*;

public class DuplicateChars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        if(!sc.hasNextLine())return;

        String s = sc.nextLine();

        int[] freq = new int[25];

        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }

        for(int i = 0 ; i < 25 ;i++){
            if(freq[i]>1)
                {
                    System.out.println((char) (i + 'a') + " - " + freq[i]);
                }
        }

        sc.close();
        
    }
    
}
