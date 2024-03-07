package Class07;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiaojin
 * @date 2024/3/7
 */
public class Code257_BinaryTreeAllPath {

    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val){
            this.val = val;
        }

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        String listans = "";
        process(ans,root,listans);
        return ans;
    }

    public static void process(List<String> ans,TreeNode root,String listans){
        if(root.left == null && root.right == null){
            String temp = listans;
            temp += root.val;
            ans.add(temp);
            return;
        }

        //非叶节点
        listans += root.val + "->";
        if(root.left != null){
            process(ans,root.left,listans);
        }
        if(root.right != null){
            process(ans,root.right,listans);
        }
        listans = listans.substring(0,listans.length() - 2);
    }
}
