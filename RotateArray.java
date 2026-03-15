class RotateArray {

    public static int[] rotate1(int[] arr,int k){

        int n = arr.length;

        int[] res = new int[n];
        k = k%n;
        if(k > n)return res;

        int j =0;

        for(int i = k+1; i < arr.length;i++){
            res[j++] = arr[i];
        }

        for(int i = 0 ; i < k+1;i++){
            res[j++] = arr[i];
        }
        return res;
    }

    public static void rotate2 (int[] arr , int k){

        int n = arr.length;
        k = k %n;
        
        reverse(arr , 0 , n-1);

        reverse(arr, 0, k-1);

        reverse(arr, k, n-1);
    }
    private static void reverse(int[] arr , int start , int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
    public static void printArr(int[] res){
        for(int i : res){
            System.out.print(i+" ");
        }
        System.err.println("");
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        int[] res = rotate1(arr,k);

        printArr(res);

        rotate2(arr, k);    
        printArr(arr);
        
    }
    
}
