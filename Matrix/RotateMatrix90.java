package Matrix;

import java.util.Scanner;

public class RotateMatrix90 {

    public static void printArr(int[][]arr , int n){

       for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < n;j++){
               System.out.print(arr[i][j]+ " ");
            }
            System.out.println( );
        }
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()){
            sc.close();
            return;
        }

        int n = sc.nextInt();

        int[][]matrix = new int[n][n];

        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j < n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < n ;i++){
            for(int j = i ;  j < n;j++){
                int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < n ;i++){
            int low = 0;
            int high = n-1;

            while(low<high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                high--;
                low++;
            }
        }

        printArr(matrix, n);
        sc.close();
    }
    
}
