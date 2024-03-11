package Class06;

/**
 * @author Xiaojin
 * @date 2024/2/27
 */
public class Code7_BalanceBinaryTree {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static class Info{
        public boolean isBalanced;
        public int height;

        public Info(boolean i,int h){
            isBalanced = i;
            height = h;
        }
    }

    public static boolean isBalanced(TreeNode root){
        return process(root).isBalanced;
    }

    public static Info process(TreeNode x){
        if( x == null){
            return new Info(true,0);
        }
        Info Linfo = process(x.left);
        Info Rinfo = process(x.right);
        int height = Math.max(Linfo.height,Rinfo.height) + 1;
        boolean isBalanced = Linfo.isBalanced && Rinfo.isBalanced && Math.abs(Linfo.height - Rinfo.height) < 2;

        return new Info(isBalanced,height);
    }

}
