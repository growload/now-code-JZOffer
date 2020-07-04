package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 11:40
 * @version: v1.0
 * @description:
 * 输入一个整数数组，
 * 实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 相邻情况：
 * 奇数  奇数   不换
 * 偶数  偶数   不换
 * 奇数  偶数   不换
 * 偶数  奇数   交换
 */
public class JZ13 {
    public static void reOrderArray(int [] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j]%2==0&& array[j + 1]%2==1) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,6,2,7,9,8};
        reOrderArray(arr);
        for (int i : arr) {
            System.out.println(i + ",");
        }
    }
}
