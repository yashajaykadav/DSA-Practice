import java.util.*;
import java.util.stream.IntStream;
class MoveZeroEnd{

    public static int[] moveZero(int[] nums){
        int[] nonzeros = Arrays.stream(nums)
        .filter(n->n!=0)
        .toArray();

        int[] zeros = Arrays.stream(nums)
        .filter(n->n==0)
        .toArray();

        return IntStream.concat(Arrays.stream(nonzeros), Arrays.stream(zeros))
                .toArray(); 
    }

    public static void main(String[] args) {
        int [] nums = {1,0,2,0,551,236,0,4,8,2,1,0,45,6,40};

        int res[] = moveZero(nums);
    
        for(int i: res)System.out.print(i+" ");
    }

}