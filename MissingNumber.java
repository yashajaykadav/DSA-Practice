import java.util.*;

class MissingNumber{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int Start = sc.nextInt();
        int End = sc.nextInt();
        int N = sc.nextInt();
        
        int exclude[] = new int[N];
        for(int i = 0 ; i < N ;i++){
            exclude[i] = sc.nextInt();
        }
        Arrays.sort(exclude);
        
        int Current = Start;

        for(int ex : exclude){

            if(ex >= Current && ex <= End){

                if(ex>Current){
                    System.out.print("["+Current+" "+(ex-1)+"]");
                }
                Current = ex+1;
                
            }
            
        }
        if(Current < End){
            System.out.println("["+Current+" "+End+"]");
        }
sc.close();

    }
}