package JZOffer;

import java.util.Stack;

/**
 * @author: zdefys
 * @date: 2020/7/4 9:44
 * @version: v1.0
 * @description: 用两个栈来实现一个队列，
 * 完成队列的Push和Pop操作。
 * 队列中的元素为int类型。
 */
public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);

    }

    public int pop() {
        // 将stack1中的数   存入stack2中
        // 使得stack1的数字在stack2的最上面
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        // 从stack2中拿出一个数  这个数必然是最先进入stack1的数
        int result = stack2.pop();
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return result;
    }
}
