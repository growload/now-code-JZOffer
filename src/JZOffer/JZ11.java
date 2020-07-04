package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 11:24
 * @version: v1.0
 * @description:
 * 输入一个整数，输出该数32位二进制表示中1的个数。
 * 其中负数用补码表示。
 */
public class JZ11 {
    public int NumberOf1(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            result += chars[i]-'0';
        }
        return result;
    }

    public static void main(String[] args) {
        JZ11 jz11 = new JZ11();
        jz11.NumberOf1(100);
    }
}
