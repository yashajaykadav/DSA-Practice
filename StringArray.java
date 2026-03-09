import java.util.Scanner;

public class StringArray{
    public static void main(String[] args) {

        int rows = 3;
        int cols = 2;

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] lines = input.split(",");


        int[][] mat = new int[rows][cols];
        int k =0;

        for(int i = 0 ; i < rows ;i++){
            for(int j = 0 ;  j  < cols;j++){
                mat[i][j] = Integer.parseInt(lines[k]);
                k++;
            }
        }
        for(int i = 0 ; i < rows;i++){
            for(int j = 0 ; j < cols;j++){
                System.out.print(mat[i][j]);
            }
            System.out.println("");
        }
        sc.close();
    }
}