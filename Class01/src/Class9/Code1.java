package Class9;

public class Code1 {


    public static void main(String[] args) {
        int[] arr = {2,8,9,6,10,3,88,44,52,431,7};
        int[] arr2 = SelectSort(arr);
        for(int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }


    public static int[] SelectSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length -i - 1; j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

}
