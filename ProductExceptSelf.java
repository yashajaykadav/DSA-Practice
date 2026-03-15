public class ProductExceptSelf {

    static int[] getResult(int nums[]){
        int n = nums.length;
        int[] product = new int[n];

        for(int i = 0 ; i < n ;i++){
            product[i] =1;

            for(int j = 0 ; j < n;j++){
                if(j!=i){
                    product[i] *= nums[j];
                }
            }

        }
        return product;
    }


    static int[] getResult2(int nums[]){

        int n = nums.length;

        int multi = 1;

        for(int  i  : nums){
            multi *= i;
        }

        for(int i = 0 ; i < n;i++){
            nums[i] = multi / nums[i];
        }    
        return nums ;
    }
        public static void printArr(int[] res){
        for(int i : res){
            System.out.print(i+" ");
        }
        System.err.println("");
    }

    public static void main(String[] args) {
        int nums[] = {10,-8,2,9,-4};
        int res[] = getResult(nums);
        printArr(res);
        getResult2(nums);
        printArr(nums);   
    }   
}
