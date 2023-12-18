package Class06;

/**
 * @author Xiaojin
 * @date 2023/12/18
 */
public class Code02_SameTree {

    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
    }

    public static boolean isSameTree(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null ^ q == null){
            return false;
        }

        return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

}
