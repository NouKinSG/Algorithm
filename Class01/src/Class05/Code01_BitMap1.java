package Class05;

/**
 * @author Xiaojin
 * @date 2023/12/3
 */
public class Code01_BitMap1 {

    public static class BitMap{
        private long[] bits;

        public BitMap(int max){
            bits = new long[(max + 64) >> 6];
        }

        public void add(int num){
            bits[num >> 6 ] |= (1 << (num & 63));
        }

        public void delete(int num){
            bits[num >> 6] &= ~(1 << (num & 63));
        }

        public boolean contains(int num){
            return (bits[num >> 6] & (1 << (num & 63))) != 0;
        }

    }


}
