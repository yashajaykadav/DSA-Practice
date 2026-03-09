package String;

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean isPalindrome(String s){

        int n = s.length()-1;
        int right = n;
        int left = 0;

       while(left<right){

            if(s.charAt(left)!=s.charAt(right)){
            return false;
            }

            right--;
            left++;

        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextLine()){sc.close();return;}

        String s = sc.nextLine();
        if(isPalindrome(s.toLowerCase())){
            System.out.println("Palindrome Brooo!");
        }else{
            System.out.println("Nah broo not!");
        }
       sc.close();
    }
}
