import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {

    static int getMissing(int arr[]){
        int n = arr.length;

        for(int i = 1 ; i <= n+1 ;i++){
            boolean isFound = false;

            for(int j : arr){
                if(j == i){
                    isFound = true;
                    break;
                }

            }
            if(!isFound ){
                return i;
            }
        }
        return -1;
    }

    public static int getMissing2(int[] nums){
        
        Set<Integer> set = new HashSet<>();
        int n = nums.length;

        for(int i : nums){
            set.add(i);
        }

        for(int i = 1 ; i < n+1;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        
        int arr[] = {-2,4,2,1,3,8};

        int res = getMissing(arr);
        int res2 = getMissing2(arr);
        System.out.println("result :- "+res);
        System.out.println("Resulr2 :-  "+res2);
        
    }
    
}
