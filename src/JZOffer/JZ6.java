package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 10:01
 * @version: v1.0
 * @description:
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class JZ6 {

    // 在线笔试：最短时间做出来
    public int minNumberInRotateArray1(int [] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // 实际面试
    public int minNumberInRotateArray2(int [] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] - array[i + 1] > 0) {
                return array[i + 1];
            }
        }
        return 0;
    }
}
