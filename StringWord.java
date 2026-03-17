import java.util.*;

public class StringWord {

    static String[] stringToArr(String input){
        return input.split(" ");
        
    }

    static String[] stringToaArr2(String input){
        return input.split(",");
         
    }

    static void printArr(String[] str){
        for(String s : str)System.out.print(s+" ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] res = stringToArr(inp);
        printArr(res);

        String inp2 = sc.nextLine();
        String[] res2 = stringToaArr2(inp2);
        printArr(res2);

        sc.close();   
    }
    
}
