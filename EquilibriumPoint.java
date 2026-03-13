import java.util.*;


class EquilibriumPoint{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextLine()){
            sc.close();
            return;
        }

        String input = sc.nextLine();

        String[] parts = input.trim().split("\\s+");


        int[] arr = new int[parts.length];

        int totalSum = 0;

        for (int i = 0 ; i < parts.length ;i++){
            arr[i] = Integer.parseInt(parts[i]);
            totalSum += arr[i];
        }

        int leftSum = 0;
        int res =-1;
        for(int i = 0 ; i < arr.length;i++){
            if(leftSum ==  (totalSum-leftSum-arr[i])){

                res = i;

            }
            leftSum+=arr[i];
        }
        System.out.println("result index : "+res);

sc.close();
    }
}