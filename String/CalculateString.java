import java.util.*;

class CalculateString{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextLine()){
            sc.close();
            return;
        }

        String input = sc.nextLine();

        long sum =0;
        for(int i = 0 ; i < input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                sum = sum + (input.charAt(i)-'0');
            }
        }

        System.out.println(sum);


        sc.close();

    }
}