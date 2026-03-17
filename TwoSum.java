import java.util.*;

public class TwoSum {


    static int[] solve(List<Integer> arr,int target){

        int[] res = new int[2];

        for(int i : arr){
            int remaining = target - i;
            if(arr.contains(remaining) && arr.indexOf(i)!=arr.indexOf(remaining)){
                res[0] = arr.indexOf(i);
                res[1] = arr.indexOf(remaining);
            }
        }

        return res;
    }

    static int[] solve2 (List<Integer> arr, int target){
        int[] res = new int[2];

        Collections.sort(arr);
        
        int left = 0;
        int right = arr.size()-1;
        int sum = 0;
        while(left< right){
            sum = arr.get(left)+arr.get(right);

            if(sum==target){
                res[0] = left;
                res[1]=right;
                return res;
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
    
        return res;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int target = sc.nextInt();


        String parts[] = inp.split(",");
        List<Integer> arr = new ArrayList<>();
        for(String str : parts){
            arr.add(Integer.parseInt(str));
        }

        int[] res = solve(arr,target);
        int[] res2 = solve2(arr,target);

        for(int i : res){
            System.out.print(i+" ");
        }

        for(int i : res2)System.out.print(i+" ");

        sc.close();
    }
    
}
