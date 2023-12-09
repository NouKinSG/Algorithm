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

    public static boolean isNeg(int n){
        return n < 0;
    }

    public static int Div(int a,int b){

//        int x = isNeg(a) ? negNum(a) : a;
//        int y = isNeg(b) ? negNum(b) :b;
//
//        int ans = 0;
//        int discuss = minus(x,y);
//        while(discuss >= 0){
//            ans = add(ans,1);
//            discuss = minus(discuss,y);
//        }
//        return isNeg(a) ^ isNeg(b) ? negNum(ans) : ans;


        int x = isNeg(a) ? negNum(a) : a;
        int y = isNeg(b) ? negNum(b) :b;
        int res = 0;
        for (int i = 30; i >= 0; i = minus(i, 1)) {
            if ((x >> i) >= y) {
                res |= (1 << i);
                x = minus(x, y << i);
            }
        }
        return isNeg(a) ^ isNeg(b) ? negNum(res) : res;

    }

    public static int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
            return 1;
        } else if (b == Integer.MIN_VALUE) {
            return 0;
        } else if (a == Integer.MIN_VALUE) {
            if (b == negNum(1)) {
                return Integer.MAX_VALUE;
            } else {
                int c = Div(add(a, 1), b);
                return add(c, Div(minus(a, multi(c, b)), b));
            }
        } else {
            return Div(a, b);
        }
    }


    public static void main(String[] args) {
        int a = 100;
        int b = 3;
        System.out.println(Div(a,-b));
    }

}
