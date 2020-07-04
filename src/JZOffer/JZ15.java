package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 12:15
 * @version: v1.0
 * @description:
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class JZ15 {
    public ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            // 到尾节点
            // 让倒数第一个节点指向倒数第二个节点
            head.next.next = head;
            // 返回第一个节点
            return head.next;
        } else {
            ListNode result = ReverseList(head.next);
            head.next.next = head;
            head.next=null;
            return result;
        }
    }
}
