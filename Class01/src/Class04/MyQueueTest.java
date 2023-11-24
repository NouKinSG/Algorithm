package Class04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Xiaojin
 * @date 2023/11/24
 */
public class MyQueueTest {
    public static void main(String[] args){
        Queue<Integer> javaQueue = new LinkedList<>();
        Code02_LinkedListToQueueAndStack.MyQueue<Integer> queue = new Code02_LinkedListToQueueAndStack.MyQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
    }
}
