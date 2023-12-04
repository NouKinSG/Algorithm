package Class04;

/**
 * @author Xiaojin
 * @date 2023/12/3
 */
public class Code06_MergeTwoSortedLinkedList {

    public static class ListNode{
        public int val;
        public ListNode next;
    }

    public static ListNode mergeTwoLists(ListNode list1,ListNode list2){
        if(list1 == null || list2 == null){
            return list1 == null ? list2 : list1;
        }
        ListNode ans = list1.val >= list2.val ? list2 : list1;
        ListNode cur1 = ans.next;
        ListNode cur2 = ans == list1  ? list2 :list1;
        ListNode pre = ans;
        
        while(cur1 != null && cur2 != null){
            if(cur1.val >= cur2.val){
                pre.next = cur2;
                cur2 = cur2.next;
            }else{
                pre.next = cur1;
                cur1 = cur1.next;
            }
            pre = pre.next;
        }
        pre.next = cur1 == null ? cur2 : cur1;
        return ans;
    }

}
