package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/3 19:06
 * @version: v1.0
 * @description: 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 */
public class JZ1 {

    // 在线笔试
    public boolean find1(int target, int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                if (value == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // 面试
    public boolean find2(int target, int[][] array) {
        int row = 0;
        int col = array[0].length-1;
        while (true) {
            if (col < 0 || row >= array.length) {
                break;
            }
            if (target == array[row][col]) {
                return true;
            } else if (target > array[row][col]) {
                row++;
                continue;
            } else if (target < array[row][col]) {
                col--;
                continue;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
