package JZOffer;

import java.util.ArrayList;

/**
 * @author: zdefys
 * @date: 2020/7/3 19:32
 * @version: v1.0
 * @description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */
public class JZ3 {
    // 在线笔试
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode==null) {
            return new ArrayList<>();
        }
        if (listNode.next != null) {
            ArrayList<Integer> result = printListFromTailToHead(listNode.next);
            // 将当前节点的值添加进集合
            result.add(listNode.val);
            return result;
        } else {
            // 说明是最后一个节点  添加进集合 返回
            ArrayList<Integer> result = new ArrayList<>();
            result.add(listNode.val);
            return result;
        }
    }

    public static void main(String[] args) {

    }


}
class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}