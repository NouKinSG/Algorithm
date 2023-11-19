package Class03;

/**
 * @author Xiaojin
 * @date 2023/11/18
 */
public class Code02_BSAwesome {
    // 局部最小问题
    public static int oneMinIndex(int[] arr){
        if(arr == null || arr.length == 0){
            return -1;
        }
        if(arr.length == 1 || arr[0] < arr[1]){
            return 0;
        }
        int N = arr.length;
        if(arr[N-1] < arr[N-2]){
            return N-1;
        }
        int L = 1;
        int R = N-2;
        int ans = -1;
        while (L <= R){
            int mid = L + ((R-L) >> 1);
            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]){
                ans = mid;
                break;
            }else if(arr[mid] > arr[mid-1]){
                R = mid - 1;
            }else{      // arr[mid] < arr[mid+1]
                L = mid + 1;
            }
        }
        return ans;
    }

    //生成随机数组，且相邻数不相等
    public static int[] randomArray(int maxLen,int maxValue){
        int len = (int) (Math.random() * maxLen);
        int[] arr = new int[len];
        if (len > 0){
            arr[0] = (int) (Math.random() * maxValue);
            for(int i=1;i<len;i++){
                do{
                    arr[i] = (int) (Math.random() * maxValue);
                } while (arr[i] == arr[i-1]);
            }
        }
        return arr;
    }

    public static boolean check(int[] arr,int minIndex){
        if(arr.length == 0){
            return minIndex == -1;
        }
        int left = minIndex - 1;
        int right = minIndex + 1;
        boolean leftBigger = left >= 0 ? arr[left] > arr[minIndex] : true;
        boolean rightBigger = right < arr.length ? arr[right] > arr[minIndex] : true;
        return leftBigger && rightBigger;
    }

    public static void printArray(int[] arr){
        if(arr == null){
            return;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
            int testTime = 10000000;
            int maxLen = 100;
            int maxValue = 1000;
        System.out.println("测试开始");
            for(int i = 0; i < testTime; i++){
                int[] arr = randomArray(maxLen,maxValue);
                int ans = oneMinIndex(arr);
                if(!check(arr,ans)){
                    printArray(arr);
                    System.out.println(ans);
                    break;
                }
            }
        System.out.println("测试结束");
    }

}
