package Class04;

/**
 * @author Xiaojin
 * @date 2023/12/1
 */
public class Code05_AddTwoNumbers {
    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val){this.val = val;}

        public ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    // 2、L无 S有
    // 3、L有 S无

    // 获取链表长度
    public static int listLength(ListNode head){
        int ans = 0;
        while(head != null){
            head = head.next;
            ans++;
        }
        return ans;
    }


    public static ListNode addTwoNumbers(ListNode head1,ListNode head2){
        int len1 = listLength(head1);
        int len2 = listLength(head2);

        ListNode longlist = len1 > len2 ? head1 :head2;
        ListNode shortlist = longlist ==head1 ? head2 : head1 ;

        ListNode curL = longlist;
        ListNode curS = shortlist;

        // last变量用于跟踪当前正在处理的节点的前一个节点
        // 如果最后还有进位，last可以在末尾添加一个新的节点来存储这个进位。
        ListNode last = curL;

        // 进位
        int carry = 0;
        // 当前位
        int curNum = 0;

        // 1、S有 L有
        while(curS != null){
            curNum = curL.val + curS.val + carry;
            curL.val = (curNum % 10);
            carry = curNum / 10 ;
            last = curL;
            curL = curL.next;
            curS = curS.next;
        }
        while(curL != null){
            curNum = curL.val + carry;
            curL.val = curNum % 10;
            carry = curNum / 10;
            last = curL;
            curL = curL.next;
        }
        if(carry != 0){
            last.next = new ListNode(1);
        }
        return longlist;
    }



}
