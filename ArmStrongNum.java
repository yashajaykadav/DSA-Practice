import java.util.Scanner;

public class ArmStrongNum {

    public static void  checkArmStrong(int n){

        int temp = n;
        int sum = 0;

        int len = String.valueOf(n).length();

        while(temp>0){

            int digit = temp%10;
            sum+=Math.pow(digit,len);

            temp /=10;
        }
        if(sum==n){
            System.out.println("ArmStrong Number");
        }else{
            System.out.println("Not ArmStrong Number");
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt())return;

        int n = sc.nextInt();

        checkArmStrong(n);

        sc.close();

    }
    
}
