package Class05;

/**
 * @author Xiaojin
 * @date 2023/12/5
 */
public class Code03_BitAddMinusMultiDiv {

    public static int add(int a,int b){
        int sum = a;
        while( b != 0 ){
             sum = a ^ b; // 无进位
             b = (a & b) << 1;
             a = sum;
        }
        return sum;
    }

}
