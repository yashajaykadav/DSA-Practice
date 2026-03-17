import java.util.*;

public class ValidParenthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(Character c : input.toCharArray()){
            if(c == '(')stack.push(')');
            else if(c=='{')stack.push('}');
            else if(c=='[')stack.push(']');
            
            if(stack.isEmpty()|| stack.pop()!=c)break;
            if(stack.peek()==c){
                stack.pop();
            }
            
           }
        

        if(stack.isEmpty()){
            System.out.println("Valid");
        }else{
            System.out.println("Not Valid");
        }

        sc.close();
    }
    
}
