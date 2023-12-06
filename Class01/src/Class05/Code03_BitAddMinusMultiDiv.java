package Class05;

/**
 * @author Xiaojin
 * @date 2023/12/5
 */
public class Code03_BitAddMinusMultiDiv {

    public static int add(int a,int b){
        int sum = a;
        while( b != 0 ){
             sum = a ^ b; // 无进位相加信息 ->  sum
             b = (a & b) << 1;  // 进位信息 ->  b-> b`(进位信息)
             a = sum;   // a -> a` 无进位相加信息
        }
        return sum;
    }

    public static int negNum(int n){
        return add(~n,1);
    }

    public static int minus(int a,int b){
        return add(a,negNum(b));  //减去一个数，等于加数这个数的负数
    }

    public static int multi(int a,int b){
        int res = 0;
        if(a == 0 ||b == 0){
            return res;
        }
        while(b != 0){
            if((b & 1) !=0){
                res = add(res,a);
            }
            a <<= 1;
            b >>>= 1;
        }
        return res;
    }
}
