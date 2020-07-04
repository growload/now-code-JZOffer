package JZOffer;

/**
 *
 * @author: zdefys
 * @date:  2020/7/4 15:47
 * @version: v1.0
 * @description:
 * 输入两个整数序列，
 * 第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 */
public class JZ21{

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        int[] stack = new int[pushA.length];
        int stackPointer = 0;

        int pushPointer = 0;
        int popPointer = 0;

        while (true) {
            if (stackPointer <= 0 || popA[popPointer] != stack[stackPointer - 1]) {
                if (pushPointer >= pushA.length) {
                    return false;
                }
                stack[stackPointer] = pushA[pushPointer];
                stackPointer++;
                pushPointer++;
            }
            if (popA[popPointer] == stack[stackPointer - 1]) {
                popPointer++;
                stackPointer--;
                if (popPointer >= popA.length) {
                    return true;
                }
            }
        }
    }

}