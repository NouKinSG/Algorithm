package Class04;

/**
 * @author Xiaojin
 * @date 2023/11/24
 */
public class Code03_DoubleLinkedListToDeque {

     public static class Node<V>{
         public V value;
         public Node<V> last;
         public Node<V> next;
         public Node(V v){
             this.value = v;
             last = null;
             next = null;
         }
     }

     public static class MyDeque<V>{
         private Node<V> head;
         private Node<V> tail;
         private int size;
         public MyDeque(){
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
         public void pushHead(V value){
             Node<V> cur = new Node<>(value);
             if(head == null){
                 tail = cur;
             }else{
                 cur.next = head;
                 head.last = cur;
             }
             head = cur;
             size++;
         }

         public void pushTail(V value){
             Node<V> cur = new Node<>(value);
             if(head == null){
                 head = cur;
             }else{
                 cur.last = tail;
                 tail.next = cur;
             }
             tail = cur;
             size++;
         }

         public V pollHead(){
             V ans = null;
             if(head != null){
                 ans = head.value;
                 if(head == tail){
                     head = null;
                     tail = null;
                 }else{
                     head = head.next;
                     head.last = null;
                 }
                 size--;
             }
            return ans;
        }

     }

}
