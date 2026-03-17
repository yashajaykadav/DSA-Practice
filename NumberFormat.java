import java.util.*;

public class NumberFormat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double d = sc.nextDouble();
        System.out.printf("%.3f",d);
        System.out.println("");
        
        Long l = sc.nextLong();
        System.out.printf("%.3f",l);

sc.close();
}
    
}
