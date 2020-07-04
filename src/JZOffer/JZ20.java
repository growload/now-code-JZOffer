package JZOffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * @author: zdefys
 * @date: 2020/7/4 15:17
 * @version: v1.0
 * @description:
 * 定义栈的数据结构，
 * 请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 */
public class JZ20 {


    // 面试
    int[] data = new int[128];
    int pointer = 0;
    int min = 0;
    public void push(int node) {
        data[pointer] = node;
        min = Math.max(min, node);
        if (pointer == data.length - 1) {
            // 扩充数组
            int[] newData = new int[data.length * 2];
            System.arraycopy(data,0,newData,0,data.length);
        }
        pointer++;
    }

    public void pop() {
        if (pointer == 0) {
            return;
        }
        pointer--;
        if (data[pointer] == min) {
            min = Integer.MAX_VALUE;
            for (int i = 0; i < pointer; i++) {
                min = Math.min(min, data[i]);
            }
        }
    }

    public int top() {
        if (pointer > 0) {
            return data[0];
        }
        return -1;
    }

    public int min() {
        return min;

    }

    /*// 在线笔试
    Stack<Integer> stack = new Stack<>();

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
       return stack.get(0);
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < stack.size(); i++) {
            min = Math.min(min, stack.get(i));
        }
        return min;
    }*/
}
