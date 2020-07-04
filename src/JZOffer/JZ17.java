package JZOffer;

/**
 * @author: zdefys
 * @date: 2020/7/4 13:06
 * @version: v1.0
 * @description:
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class JZ17 {

    public boolean isSame(TreeNode roo1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (roo1 == null) {
            return false;
        }
        if (roo1.val == root2.val) {
            return isSame(roo1.left, root2.left) && isSame(roo1.right, root2.right);
        } else {
            return false;
        }

    }

    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1 == root2) {
            return true;
        }

        return isSame(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }
}
