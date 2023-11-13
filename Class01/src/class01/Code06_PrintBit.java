package class01;

/**
 * @author Xiaojin
 * @date 2023/10/10
 */
public class Code06_PrintBit {

    public static void print(int num){
        for(int i=31;i>=0;i--){
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args){
        //32位
        int num =83928328;

        print(-1);

        int c =5;
        int d =-c;


    }

}
