package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 12:54
 * @version: v1.0
 * @description: 输入两个单调递增的链表，
 * 输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */
public class JZ16 {

    // 找到两个链表里最小的值
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }
        // 两个链表之后  链表头是哪个？
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
