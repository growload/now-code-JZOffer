package JZOffer;


/**
 * @author: zdefys
 * @date: 2020/7/3 19:47
 * @version: v1.0
 * @description:
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
 * 则重建二叉树并返回。
 */
public class JZ4 {

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if (pre.length == 0 || in.length == 0) {
            return null;
        }
        // 拿到根节点
        TreeNode now = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; i++) {
            // 找出根节点在中序遍历的索引位置
            if (in[i] == pre[0]) {
            // 根节点的左边是左子树的点
                int[] leftPre = new int[i];
                int[] leftIn = new int[i];
                System.arraycopy(pre,1,leftPre,0,i);// 原数组  原数组的起点  目标数组
                System.arraycopy(in, 0, leftIn, 0, i);// 原数组  原数组的起点  目标数组
                TreeNode left = reConstructBinaryTree(leftPre, leftIn);
                // 根节点的右边是右子树的点
                int[] rightPre = new int[pre.length-i-1];
                int[] rightIn = new int[pre.length-i-1];
                System.arraycopy(pre,i+1,rightPre,0,pre.length-i-1);
                System.arraycopy(in, i + 1, rightIn, 0, pre.length - i - 1);
                TreeNode right = reConstructBinaryTree(rightPre, rightIn);

                now.left = left;
                now.right = right;
            }
        }

        return now;
    }
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
