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

    //返回[0,1)的一个小数
    // 任意的x, x属于[0,1), [0,x)范围上的数出现概率为 由原来的x调整成x^2
    public static double xPower2(){
        return Math.max(Math.random(),Math.random());
        //return Math.min(Math.random(),Math.random());  // 这是取 1 - (1-x)^2
    }

    // lib里的 不能改
    public static int f1(){
        return (int) (Math.random() * 5) + 1;
    }

    //随机机制，只能用f1
    //等概率返回0和1
    public static int f2(){
        int ans = 0;
        do{
            ans = f1();
        } while(ans == 3);
        return ans < 3 ? 0 : 1;
    }
}
