package Class04;

/**
 * @author Xiaojin
 * @date 2023/11/23
 */
public class Code01_ReverseList {

    // 单节点
    public static class Node{
        public int value;
        public Node next;

        public Node(int value){
            this.value = value;
        }
    }

    // 双链节点
    public static class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int value){
            this.value = value;
        }
    }

    public static Node reverseList(Node head){
        Node pre = null;
        Node next = null;
        while(head != null){
            next = head.next; // 保存下一个节点
            head.next = pre;  // 当前节点指向前一个节点
            pre = head;       // pre指向当前节点
            head = next;      // head指向下一个节点
        }
        return pre;
    }

    public static DoubleNode reverseList(DoubleNode head){
        DoubleNode pre = null;
        DoubleNode next = null;
        while(head != null){
            next = head.next; // 保存下一个节点
            head.next = pre;  // 当前节点指向前一个节点
            head.last = next; // 当前节点指向后一个节点
            pre = head;       // pre指向当前节点
            head = next;      // head指向下一个节点
        }
        return pre;
    }

    

}
