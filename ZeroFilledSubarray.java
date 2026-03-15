public class ZeroFilledSubarray {


    static int calculateZeros(int[] nums){
        int zeroCount =0;
        int result = 0;

        for(int i : nums){
            if(i ==0 ){
                zeroCount++;
            }
            else{
                result += zeroCount *(zeroCount + 1L) / 2;
                zeroCount = 0;
            }
        }

        result += zeroCount * (zeroCount+1L)/2;
        return result;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 0, 0, 2, 0, 0, 0, 3, 0, 0};

        int res = calculateZeros(arr);

        System.out.println("Result :-  "+res);
    }
    
}
