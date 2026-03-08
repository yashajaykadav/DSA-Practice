public class AbundantNumber {

    static void checkNum(int n) {
        // 1. Base Case: Numbers <= 1 cannot be Abundant
        if (n <= 1) {
            System.out.println("Not Abundant");
            return;
        }

        // 2. Initialize sum at 1 because 1 is a proper divisor of every number > 1
        int subdivisorSum = 1;

        // 3. Optimization: Loop only up to Square Root of n
        // This reduces time complexity from O(n) to O(sqrt(n))
        for (int i = 2; i <= Math.sqrt(n); i++) {
            
            // 4. Check if 'i' is a divisor
            if (n % i == 0) {
                
                /* 
                 * 5. Correction needed here: 
                 * You used (n << 1), which means (n * 2). 
                 * To check if 'i' is the middle divisor of a perfect square (like 6 for 36),
                 * we should check if i == (n / i).
                 */
                if (i == (n / i)) {
                    subdivisorSum += i; // Add only once (e.g., for n=36, i=6)
                } else {
                    // Add both 'i' and its partner 'n/i' (e.g., for n=12, add 2 and 6)
                    subdivisorSum += (i + (n / i));
                }
            }
        }

        // 6. Final Comparison
        if (subdivisorSum > n) {
            System.out.println(n + " is Abundant");
        } else {
            System.out.println(n + " is not Abundant");
        }
    }

    public static void main(String[] args) {
        int n = 12; // Example: 1, 2, 3, 4, 6 sum to 16. 16 > 12 = Abundant.
        checkNum(n);
    }
}
