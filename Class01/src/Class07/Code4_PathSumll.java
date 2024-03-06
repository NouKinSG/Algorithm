package Class07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Xiaojin
 * @date 2024/3/6
 */
public class Code4_PathSumll {

    public static class TreeNode {
        public int val;
        public TreeNode left;
        public TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<List<Integer>> pathSum(TreeNode root,int sum){
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        ArrayList<Integer> path = new ArrayList<>();
        process(root,path,0,sum,ans);
        return ans;
    }

    public static void process(TreeNode root,List<Integer> path,int preSum,int sum,List<List<Integer>> ans){
        if(root.left == null && root.right == null){
            if(preSum + root.val == sum){
                path.add(root.val);
                ans.add(copy(path));
                path.remove(path.size() - 1);
            }
            return;
        }

        // 非叶节点
        path.add(root.val);
        preSum += root.val;
        if(root.left != null){
            process(root.left,path,preSum,sum,ans);
        }
        if(root.right != null){
            process(root.right,path,preSum,sum,ans);
        }

        path.remove(path.size() - 1);
    }

    public static List<Integer> copy(List<Integer> path){
        List<Integer> ans = new ArrayList<>();
        for(Integer num : path){
            ans.add(num);
        }
        return ans;
    }


}
