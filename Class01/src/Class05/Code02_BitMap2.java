package Class05;

/**
 * @author Xiaojin
 * @date 2023/12/5
 */
public class Code02_BitMap2 {

    //正确的类
    public static class BitMap{
        private long[] bits;

        public BitMap(int max){
            bits = new long[(max + 64) >> 6];
        }

        private void add(int num){
            bits[num >> 6] |= (1L << (num & 63));
        }

        private void delete(int num){
            bits[num >> 6] &= ~(1L << (num & 63));
        }

        private boolean contains(int num){
            return (bits[num >> 6] & (1L << (num & 63))) != 0;
        }
    }
}
