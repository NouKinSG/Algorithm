package Class04;

/**
 * @author Xiaojin
 * @date 2023/11/24
 */
public class Code02_LinkedListToQueueAndStack {

    public static class Node<V>{
        public V value;
        public Node<V> next;
        public Node(V value){
            this.value = value;
            next = null;
        }
    }

    public static class MyQueue<V>{
        private Node<V> head;
        private Node<V> tail;
        private int size;
        public MyQueue(){
            head = null;
            tail = null;
            size = 0;
        }

        public boolean isEmpty(){
            return size == 0;
        }
        public int size(){
            return size;
        }

        public void offer(V value){
            Node<V> cur = new Node<>(value);
            if(tail == null){
                head = cur;
            }else{
                tail.next = cur;
            }
            tail = cur;
            size++;
        }

        public V poll(){
            V ans = null;
            if(head != null){
                ans = head.value;
                head = head.next;
            }
            return ans;
        }

        public V peek(){
            V ans = null;
            if(head != null){
                ans = head.value;
            }
            return ans;
        }
    }

}
