public class StockSell2 {

    static int StockExchange(int[] res){
        int maxProfit = 0;
        int n = res.length;

        for(int i = 1 ; i < n ;i++){

            if(res[i]> res[i-1]){
                maxProfit += res[i] - res[i-1];
            }

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};

        int result = StockExchange(arr);

        System.out.println("result = "+result);

    }
    
}
