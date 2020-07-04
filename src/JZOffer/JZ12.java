package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 11:32
 * @version: v1.0
 * @description: 给定一个double类型的浮点数base和int类型的整数exponent。
 * 求base的exponent次方。
 * <p>
 * 保证base和exponent不同时为0
 */
public class JZ12 {

    // 在线笔试
    public double Power(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    // 面试
    public double Power1(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            result *= base;
        }
        return exponent > 0 ? result : 1.0 / result;
    }
}
