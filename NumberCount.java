import java.util.*;

class NumberCount{


    static void CountLength1(int n){
        /// Simpler Convert in string
        
        String res = Long.toString(n);

        System.out.println(res.length());

    }


    static void CountLength2(int n){

        //Simpler Iterative Way
        int temp = n;
        int count = 0;

        while(temp > 0){
            temp /=10;
            count++;
        }

        System.out.println(count);
    }

static void CountLength3(int n ){

     int res = (int) Math.floor(Math.log10(n)+1);
     System.out.println(res);
}

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNextInt()){
            sc.close();
            return;
        }
        int n = sc.nextInt();

        CountLength1(n);
        CountLength2(n);
        CountLength3(n);

        sc.close();


    }

}