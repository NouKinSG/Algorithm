package class01;

/**
 * @author Xiaojin
 * @date 2023/11/13
 */
public class Code07_SelectionSort {

        public static void selectionSort(int[] arr){
            if(arr == null || arr.length < 2){
                return;
            }
            // 0~N-1
            // 1~N-1
            // 2~N-1
            for(int i=0;i<arr.length-1;i++){
                //最小值在哪个位置上
                int minIndex = i;
                //i~N-1上找最小值的下标
                for(int j=i+1;j<arr.length;j++){
                    minIndex = arr[j] < arr[minIndex] ? j : minIndex;
                }
                //交换
                swap(arr,i,minIndex);
            }
        }

        public static void swap(int[] arr,int i,int j){
            if(i == j){
                return;
            }
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j]; //arr[i] ^ arr[j] ^ arr[j] = arr[i]
            arr[i] = arr[i] ^ arr[j]; //arr[i] ^ arr[j] ^ arr[i] = arr[j]
        }

        public static void printArray(int[] arr){
            if(arr == null || arr.length<2){
                return;
            }
            for (int j : arr) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        public static void main(String[] args){
            int[] arr = {3,2,1,4,5};
            printArray(arr);
            selectionSort(arr);
            printArray(arr);
        }
}
