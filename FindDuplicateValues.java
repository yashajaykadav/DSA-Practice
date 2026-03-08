import java.util.HashMap;
import java.util.Map;

public class FindDuplicateValues {


    public static void duplicateValues(int[] arr){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }

        for(int i : map.keySet()){
            if(map.get(i)>1){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 3, 5, 6, 9, 8, 1, 1, 5, 4};

        duplicateValues(arr);
        

    }
    
}
