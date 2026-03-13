
public class StockSells {


    public static int getPrice(int[] prices){
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }

    public static int getOptimizedPrice(int[] prices){
        int maxProfit =0;
        int minPrice =Integer.MAX_VALUE;

        for(int i : prices){
            
            minPrice = Math.min(minPrice,i);
            int profit = i-minPrice;
            maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] arr = {7,4,9,5,1};

        int result = getPrice(arr);
        int result1 = getOptimizedPrice(arr);

        System.out.println(result);
        System.out.println(result1);

      
    }
    
}
