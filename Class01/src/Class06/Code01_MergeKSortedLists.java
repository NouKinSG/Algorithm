package Class06;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Xiaojin
 * @date 2023/12/12
 */
public class Code01_MergeKSortedLists {
    public static class ListNode {
        public int val;
        public ListNode next;
    }

    public static class ListNodeComparator implements Comparator<ListNode>{
        @Override
        public int compare(ListNode o1, ListNode o2) {
            return o1.val - o2.val;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists){
        if(lists == null){
            return null;
        }

        // 创建小根堆
        PriorityQueue<ListNode> heap = new PriorityQueue<>(new ListNodeComparator());
        for(int i = 0; i < lists.length;i++){
            if(lists[i] != null){
                heap.add(lists[i]);
            }
        }

        if(heap.isEmpty()){
            return null;
        }

        //返回的头 head
        ListNode head = heap.poll();

        // pre用于指向
        ListNode pre = head;
        if(pre.next != null){
            heap.add(pre.next); // 往根堆里塞下一个节点
        }

        // 根堆里有东西才需要继续
        while(!heap.isEmpty()){
            ListNode cur = heap.poll();
            pre.next = cur;
            pre = cur;
            if(cur.next != null){
                heap.add(cur.next);// 往根堆里塞下一个节点
            }
        }
        return head;
    }





}
