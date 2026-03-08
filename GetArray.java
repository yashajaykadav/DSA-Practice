import java.util.Scanner;

public class GetArray {

    public static int[] getArray(int n, Scanner sc){
        
        int[] arr = new int[n];
        for(int i = 0 ; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        return arr;
    }
    
}
