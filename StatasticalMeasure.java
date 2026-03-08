import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatasticalMeasure {

    public static void CalculateMean(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i : arr){
            sum+=i;
        }
        System.out.println("Mean :=> " +(double)sum/n);
    }

    public static void CalculateMedian(int[] arr){

        Arrays.sort(arr);
        int n = arr.length;

        double median = (arr[n/2]+arr[(n/2)-1])/2.0;

        System.out.println("Median :=> "+median);
       
    }

    public static void CalculateMode(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        int mode = arr[0];
        int maxFreq = 0;

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>maxFreq){
                maxFreq = entry.getValue();
                mode = entry.getKey();
            }
            
        } 
System.out.println("Mode :=> " + mode);
   }


        public static void CalculateRange(int[] arr){
        Arrays.sort(arr);

        int range = arr[arr.length-1]-arr[0];

        System.out.println("Range :=> "+range);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // if(!sc.hasNextInt())return;
        // int n = sc.nextInt();
        // int[] arr = GetArray.getArray(n,sc);
        int[] arr = {1, 2, 1, 2, 3, 5, 6, 9, 8, 1, 1, 5, 4};

        
        CalculateMean(arr);
        CalculateMedian(arr);
        CalculateMode(arr);
        CalculateRange(arr);
        
        sc.close();
        
    }
    
}
