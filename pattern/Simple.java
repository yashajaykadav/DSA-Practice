package pattern;

import java.util.Scanner;

public class Simple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int j = 0 ; j < n;j++){
        for(int i = 0 ; i < n;i++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    
}
