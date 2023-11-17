package class01;


/**
 * @author Xiaojin
 * @date 2023/11/17
 */
public class Comp {
    public static void selectionSort(int[] arr){
        if(arr == null || arr.length <2){
            return;
        }

        for(int i=0;i<arr.length - 1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex;
            }
            swap(arr,i,minIndex);
        }
    }

    public static void swap(int[] arr,int i,int j){
        if(i == j){
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[j] ^ arr[i];
    }

    //返回一个数组arr，arr长度为[0,maxLen-1],arr中的每个值都是[0,maxValue-1]
    public static int[] lenRandomValueRandom(int maxLen,int maxValue){
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = (int) (Math.random() * maxValue);
        }
        return arr;
    }

    public static int[] copyArray(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i];
        }
        return ans;
    }

    public static boolean isSort(int[] arr){
        if(arr.length<2)
            return true;

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < max){
                return false;
            }
            max = Math.max(max,arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int maxLen = 10;
        int maxValue = 100;
        int testTime = 100000;
        for (int i=0;i<testTime;i++){
            int[] arr1 = lenRandomValueRandom(maxLen,maxValue);
            int[] arr2 = copyArray(arr1);
            selectionSort(arr1);
            if(!isSort(arr1)){
               for(int j=0;j<arr2.length;j++){
                   System.out.print(arr2[j]+" ");
               }
                System.out.println();
                System.out.println("排序错了");
                break;
            }
        }
    }
}
