import java.util.Scanner;

class PalindromeNumber{

    static boolean checkPalindrome(long n){
        long res = 0;
        long temp = n;

        while(temp>0){
            long digit = temp%10;

            res = (res*10)+digit;

            temp /= 10;
        }

        if(n==res)return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        if(!sc.hasNextLong()){sc.close();return;}
        long n = sc.nextLong();
        if(checkPalindrome(n)){
            System.out.println("Palindrome Bro ");
        }else{
            System.out.println("Nahh Broo!");
        }
        sc.close();
        
        
    }
}