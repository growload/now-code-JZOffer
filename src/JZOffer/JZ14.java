package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 11:57
 * @version: v1.0
 * @description:
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class JZ14 {

    // 在线笔试
    public ListNode FindKthToTail(ListNode head,int k) {
        // 链表节点的个数
        int num = 0;
        ListNode pointer = head;
        while (true) {
            if (pointer == null) {
                break;
            }
            pointer = pointer.next;
            num++;
        }
        if (num < k) {
            return null;
        }
        pointer = head;
        for (int i = 0; i < num-k; i++) {
            pointer = pointer.next;
        }
        return pointer;
    }

    // 面试
    public ListNode FindKthToTail2(ListNode head,int k) {
        // 如果当前pointer的next为空  代表pointer是最后一个
        ListNode pointer = head;
        while (true) {
           ListNode temp = pointer;
            for (int i = 0; i < k; i++) {
                if (temp == null) {
                    return null;
                }
                temp = temp.next;
            }
            if (temp == null) {
                return pointer;
            }
            pointer = pointer.next;
        }
    }

    public static void main(String[] args) {

    }
}