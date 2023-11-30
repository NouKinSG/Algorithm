package Class04;

/**
 * @author Xiaojin
 * @date 2023/11/30
 */
public class Code04_ReverseNodesinKGroup {

    public static class ListNode{
        public int val;
        public ListNode next;
    }


    public static ListNode getKGroupEnd(ListNode start, int k){
        while(--k != 0 && start != null){
            start = start.next;
        }
        return start;
    }

    public static void reverse(ListNode start, ListNode end){
        end = end.next;
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = start;
        while(cur != end){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        start.next = end;
    }

//    public static ListNode reverseKGroup(ListNode head,int k){
//        ListNode start = head;
//        ListNode end = getKGroupEnd(start,k);
//        if(end == null){
//            return head;
//        }
//        head = end;
//        reverse(start,end);
//        ListNode lastEnd = start;
//        while(lastEnd.next != null){
//
//        }
//        return head;
//    }



}
