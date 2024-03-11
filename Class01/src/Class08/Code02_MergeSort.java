package Class08;

/**
 * @author Xiaojin
 * @date 2024/3/7
 */
public class Code02_MergeSort {
    //递归方法实现
    public static void mergeSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }

        // 让 0 ~ N-1 上有序
        process(arr,0,arr.length - 1);
    }

    // 从 L...R 范围上，请让这个范围上的数，有序！！
    public static void process(int[] arr,int L,int R){
        //这里是已经有序了，直接返回
        if(L == R){
            return;
        }

        //
        int mid = L + ((R - L) >> 1 );
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }

    public static void merge(int[] arr,int L,int M,int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = M + 1;

        //没越界的时候
        while ( p1 <= M && p2 <=R){
            if(arr[p1] <= arr[p2]){
                help[i] = arr[p1];
                i++;
                p1++;
            }
            else{
                help[i] = arr[p2];
                i++;
                p2++;
            }
        }

        //从上面的 while出来，要么p1越界，要么p2越界
        // p1没越界，p2越界了
        while(p1 <= M){ // 拷贝p1
            help[i] = arr[p1];
            i++;
            p1++;
        }

        // p2没越界，p1越界了
        while(p2 <= R){  //拷贝p2
            help[i] = arr[p2];
            i++;
            p2++;
        }

        // 拷贝到原来的 数组里面
        for(i = 0; i < help.length; i++){
            arr[L + i] = help[i];
        }
    }



}
