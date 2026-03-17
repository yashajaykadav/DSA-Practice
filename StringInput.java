import java.util.*;

class StrintInput{


    static String addBrackets(int [] arr){
        String res = "[";
        int n =arr.length;

        for(int i = 0 ; i < n;i++){
            res = res+arr[i];
            if(i<n-1){
                res = res+",";
            }

        }
        res = res+"]";

        return res;
    }

    static int[] removeBrackets(String input){

        input = input.replaceAll("\\[|\\]","");

        String[] parts = input.split(",");

        int[] arr = new int[parts.length];

        int i =0;
        for(String s : parts){
            arr[i] = Integer.parseInt(s);
            i++;
        }

        return arr;

     }

     static void printArr(int[] arr){

        for(int i : arr)System.out.print(i+" ");
     }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int[] arr1 = removeBrackets(input);

        printArr(arr1);

        String output = addBrackets(arr1);
      System.out.println(output);
        sc.close();
        
    }
}