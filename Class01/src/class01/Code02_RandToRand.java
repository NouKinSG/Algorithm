package class01;

/**
 * @author Xiaojin
 * @date 2023/11/14
 */
public class Code02_RandToRand {

    public static void main(String[] args) {
        System.out.println("测试开始");

        int testTime = 1000000;
        int count = 0;
        for(int i=0;i<testTime;i++){
            if(Math.random() < 0.3){
                count++;
            }
        }
        System.out.println((double)count / (double)testTime);

        System.out.println("==============");

        // [0,1) -> [0,8)
        double ans = Math.random() *8;
        count=0;
        for(int i=0;i<testTime;i++){
            if(Math.random() * 8 < 5){
                count++;
            }
        }
        System.out.println((double)count / (double)testTime);
    }

}
