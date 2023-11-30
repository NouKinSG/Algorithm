package class01;

/**
 * @author Xiaojin
 * @date 2023/11/14
 */
public class Code01_PreSum {

    public static class RangeSum{
        private int[] preSum;
        public RangeSum(int[] arr){
            preSum = new int[arr.length];
            preSum[0] = arr[0];
            for(int i=1;i<arr.length;i++){
                preSum[i] = preSum[i-1] + arr[i];
            }
        }
        public int rangeSum(int L,int R){
            return L == 0 ? preSum[R] : preSum[R] - preSum[L-1];
        }

    }
}
