class RotateArray {

    public static int[] rotate1(int[] arr,int k){

        if(k > arr.length)return  new int[];
        int[] res = new int[arr.length];
        int j =0;

        for(int i = k ; i < arr.length;i++){
            res[j++] = arr[i];
        }

        for(int i = 0 ; i < k;i++){
            res[j++] = arr[i];
        }
        return res;
    }

    public static void printArr(int[] res){
        for(int i : res){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        int[] res = rotate1(arr,k);

        printArr(res);
        
    }
    
}
