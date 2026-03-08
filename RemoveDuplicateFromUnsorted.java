import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromUnsorted {

    public static void usingSet(int[] arr){
    Set<Integer> set = new LinkedHashSet<>();

        for(int i : arr)set.add(i);
        
        System.out.println(set);
    }

    public static void usingMap(int[]arr) {
            Map<Integer,Boolean>map = new HashMap<>();       
            
            for( int i : arr)if(!map.containsKey(i))map.put(i, true);
            
            System.out.println(map.keySet());
    }

    public static void usingStream(int[] arr) {

        int[] res = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(res));
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3,5,6,9,8,1,1,5,4,2};

        usingSet(arr);
        usingStream(arr);
        usingMap(arr);
       
    }
    
}
