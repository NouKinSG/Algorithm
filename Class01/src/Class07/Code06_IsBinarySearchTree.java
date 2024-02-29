package Class07;

/**
 * @author Xiaojin
 * @date 2024/2/29
 */
public class Code06_IsBinarySearchTree {

    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val){
            this.val = val;
        }

    }

    public static class Info{
        public boolean isBST;
        public int max;
        public int min;

        public Info(boolean isBST, int max, int min) {
            this.isBST = isBST;
            this.max = max;
            this.min = min;
        }
    }

    public static Info process(TreeNode x){
        if( x == null){
            return null;
        }
        Info leftinfo = process(x.left);
        Info rightinfo = process(x.right);

        int max = x.val;
        int min = x.val;

        if(leftinfo != null){
            max = Math.max(leftinfo.max, max);
            min = Math.min(leftinfo.min,min);
        }
        if(rightinfo != null){
            max = Math.max(rightinfo.max, max);
            min = Math.min(rightinfo.min,min);
        }

        boolean isBST = true;
        if(leftinfo != null && !leftinfo.isBST){
            isBST = false;
        }
        if(rightinfo != null && !rightinfo.isBST){
            isBST = false;
        }

        // left Max < x       right min > x
        boolean leftMaxlessX = (leftinfo == null) ? true : (leftinfo.max < x.val);
        boolean rightMinlessX = (rightinfo == null) ? true :(rightinfo.min > x.val);

        if(!leftMaxlessX || !rightMinlessX){
            isBST =false;
        }
        return new Info(isBST,max,min);
    }

}
