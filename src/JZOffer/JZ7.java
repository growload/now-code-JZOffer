package JZOffer;

import java.nio.channels.FileChannel;

/**
 * @author: zdefys
 * @date: 2020/7/4 10:22
 * @version: v1.0
 * @description:
 * 大家都知道斐波那契数列，
 * 现在要求输入一个整数n，
 * 请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
 * n<=39
 */
public class JZ7 {
    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public int Fibonacci1(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return a;
        }
        if (n == 1) {
            return b;
        }
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a=b;
            b=c;
        }
        return b;
    }
}
