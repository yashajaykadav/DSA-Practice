import java.util.*;;

public class ReverseWord {


    public static String reverseString(String[] arr){

        StringBuilder res = new  StringBuilder();

        for(String str : arr){
            StringBuilder word = new StringBuilder(str);

            res.append(word.reverse()+" ");

        }
        return res.toString();
        
    }

    public static String reverseWord(String[] parts){
                StringBuilder result = new StringBuilder();

        for(String s : parts){

            Stack<Character> stack = new Stack<>();

            for(char c : s.toCharArray()){
                stack.push(c);
            }
            while(!stack.isEmpty()){
                result.append(stack.pop());
            }

            result.append(" ");

        }

      return result.toString();

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextLine()){
            sc.close();
            return;
        }

        String input = sc.nextLine();

        String[] parts = input.trim().split("\\s+");

      String res1 = reverseString(parts);
      String res2 = reverseWord(parts);

      System.out.println(res1);
      System.out.println(res2);


        sc.close();
    }
    
}
