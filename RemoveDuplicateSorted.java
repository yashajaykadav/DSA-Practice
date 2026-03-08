import java.util.*;

class RemoveDuplicateSorted{


    
        public static int removeDuplicate(int[] arr, int n) {


            if(n<=1)return n;

            int k = 0;

            for(int i = 1 ; i < n;i++){
                if(arr[i]!=arr[k]){
                    k++;
                    arr[k]= arr[i];
                }
                
            }
            return k+1;
        }
        private static void printArr(int[] res,int k) {
        System.out.println("The array after removing duplicate elements is ");
            for(int i = 0 ; i < k;i++){
                System.out.println(res[i]);
            }
            }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt())return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n;i++){
           arr[i]= sc.nextInt();
        }

        int k = removeDuplicate(arr,n);
        printArr(arr,k);
        sc.close();
    
    }
            
}