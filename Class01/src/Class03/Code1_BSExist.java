package Class03;

/**
 * @author Xiaojin
 * @date 2023/11/17
 */
public class Code1_BSExist {


    //arr有序，求 >= num的最左位置
    public static int mostLeftNoLessNumIndex(int[] arr,int num){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int L = 0;
        int R = arr.length-1;
        int ans = -1;
        while(L <= R){
            int mid = L + ((R-L) >> 1);
            if(arr[mid] >= num){
                ans = mid;
                R = mid - 1;
            } else{  // arr[mid] < num
                L = mid + 1;
            }
        }
        return ans;  // 如果遍历完，都没有找到>=num的数(一直没有进入if 都是else)，返回-1
    }

    //arr有序，求 <= num的最右位置
    public static int mostRightNoMoreNumIndex(int[] arr,int num){
        if(arr == null || arr.length == 0){
            return -1;
        }
        int L = 0;
        int R = arr.length-1;
        int ans = -1;
        while (L <= R) {
            int mid = L + ((R-L) >> 1);
            if (arr[mid] <= num) {
                ans = mid;
                L = mid + 1;
            }else{
                R = mid - 1;
            }
        }
        return ans;
    }


    // 二分查找法
    public static  boolean find(int[] arr,int num){
        if(arr ==null || arr.length == 0){
            return false;
        }

        int L= 0;
        int R = arr.length-1;
        while (L <= R){
            int mid = L + ((R-L) >> 1);
            if(arr[mid] == num){
                return true;
            } else if (arr[mid] < num) {
                L = mid + 1;
            } else{
                R = mid - 1;
            }
        }
        return false;
    }


    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;
        while(left <= right){
            int mid = left + ((right-left) >> 1);
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return ans;
    }

}
