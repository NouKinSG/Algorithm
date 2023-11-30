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
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }
        return pre;
   }

    public static void printLinkedList(Node head){
          while(head != null){
                System.out.print(head.value + " ");
                head = head.next;
          }
         System.out.println();
    }

    public static void printDoubleLinkedList(DoubleNode head){
        System.out.print("head -> ");
        DoubleNode end = null;
        while(head != null){
            System.out.print(head.value + " ");
            end = head;
            head = head.next;
        }
        System.out.print("<- tail");
        System.out.println();
        while(end != null){
            System.out.print(end.value + " ");
            end = end.last;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head = null;
        head = reverseList(head);
        printLinkedList(head);

        head = new Node(1);
        head = reverseList(head);
        printLinkedList(head);

        head = new Node(1);
        head.next = new Node(2);
        head = reverseList(head);
        printLinkedList(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head = reverseList(head);
        printLinkedList(head);

        DoubleNode dhead = null;
        dhead = reverseList(dhead);
        printDoubleLinkedList(dhead);

        dhead = new DoubleNode(1);
        dhead = reverseList(dhead);
        printDoubleLinkedList(dhead);

        dhead = new DoubleNode(1);
        dhead.next = new DoubleNode(2);
        dhead = reverseList(dhead);
        printDoubleLinkedList(dhead);

        dhead = new DoubleNode(1);
        dhead.next = new DoubleNode(2);
        dhead.next.next = new DoubleNode(3);
        dhead = reverseList(dhead);
        printDoubleLinkedList(dhead);
    }


    

}
