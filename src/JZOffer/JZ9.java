package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 10:50
 * @version: v1.0
 * @description: 一只青蛙一次可以跳上1级台阶，
 * 也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JZ9 {
    public int JumpFloorII(int target) {
        if (target == 2) {
            return 2;
        }
        if (target == 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i < target; i++) {
            sum += JumpFloorII(target - i);
        }
        return sum + 1;
    }
}
