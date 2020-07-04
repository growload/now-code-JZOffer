package JZOffer;

import java.util.ArrayList;

/**
 * @author: zdefys
 * @date: 2020/7/4 14:32
 * @version: v1.0
 * @description: 输入一个矩阵，
 * 按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵：
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * 则依次打印出数字
 * 1,2,3,4,
 * 8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class JZ19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {

        int num = 0;
        int row = 0;
        int col = 0;
        // 方向设计
        int[][] toward = {{0, 1},{1, 0},{0, -1},{-1, 0}};
        ArrayList<Integer> result = new ArrayList<>();
        while (true) {
            // 每次都先把当前位置的数 放进去
            result.add(matrix[row][col]);
            matrix[row][col] = Integer.MAX_VALUE;
            if (result.size() >= matrix.length * matrix[0].length) {
                break;
            }
            // 我需要 改变row/col 取决于我们现在的运动方向
            int nextRow = row + toward[num % 4][0];
            int nextCol = col + toward[num % 4][1];
            // 判断 下一个节点是否改变方向
            if (nextRow < 0 // 行数小于0
                    || nextCol < 0  // 列数小于0
                    || nextRow >= matrix.length   // 行数大于最大行数
                    || nextCol >= matrix[0].length // 列数大于最大列数
                    || matrix[nextRow][nextCol] == Integer.MAX_VALUE) {
                num++;
            }
            row += toward[num % 4][0];
            col += toward[num % 4][1];
        }
        return result;
    }
}
