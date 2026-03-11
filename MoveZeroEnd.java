class MoveZeroEnd{

    public static void main(String[] args) {
        
        int[] arr = {1,2,0,3,0,4,0,0,6};

        int[] temp = new int[arr.length];
        int k = 0;

        for(int i : arr){

            if(i!=0){
                temp[k] = i;
                k++;

            }

        }
        while(k<arr.length){
            temp[k]=0;
            k++;
        }

        for(int i : temp){
            System.out.print(i+" ");
        }
    }
}