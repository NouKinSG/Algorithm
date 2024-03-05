package Class07;

/**
 * @author Xiaojin
 * @date 2024/3/5
 */
public class Code03_PathSum {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isSum = false;

    public static boolean hasPathSum(TreeNode root,int sum){
        if(root == null){
            return false;
        }

        isSum = false;
        process(root,0,sum);
        return isSum;
    }

    public static void process(TreeNode root,int preSum,int sum){
        if(root.left == null && root.right == null){
            boolean cur = root.val + preSum == sum;
            if(cur){
                isSum = true;
            }
            return;
        }

        // root 是非叶子节点
        preSum += root.val;
        if(root.left != null){
            process(root.left,preSum,sum);
        }

        if(root.right != null){
            process(root.right,preSum,sum);
        }

    }

}
