import java.util.*;

public class FindSecondLarge{
    public static void main(String[] args) {
        
    
    List<Integer> arr = Arrays.asList(1,5,4,8,7,9,5,6);

    int max = arr.stream()
    .distinct()
    .sorted((a,b)-> b-a)
    .limit(1)
    .findFirst()
    .orElse(-1);

    System.out.println("Second max :-> "+max);

    }
}