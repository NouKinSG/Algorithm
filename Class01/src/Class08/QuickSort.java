package Class08;

/**
 * @author Xiaojin
 * @date 2024/3/11
 */
public class QuickSort {

//    public static void splitNum(int[] arr){
//        int lessEqualR = -1;
//        int index = 0;
//        int mostR = arr.length - 1;
//        while(index < arr.length){
//            if(arr[index] <= arr[mostR])
//        }
//    }

    public static void queickSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        process(arr,0,arr.length - 1);
    }

    public static void process(int[] arr,int L,int R){
        if( L >= R){
            return;
        }

        // 选择privot（基准）
//        int privot = arr[(L + (R - L ) >> 1)]

    }

}
