/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<List<Integer>> ans;

    public int height(TreeNode root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int h = height(root);
        ans = new ArrayList<List<Integer>>();
        System.out.println(h);
        for (int i = h; i > 0; i--) {
            List<Integer> list = new ArrayList<>();
            ans.add(levelOrderprint(list, root, i));
        }
        return ans;
    }

    public List<Integer> levelOrderprint(List<Integer> list, TreeNode root, int level) {
        if (root == null) {
            return list;
        }
        if (level == 1) {
            list.add(root.val);
            System.out.println(root.val);
        }
        if (level > 1) {
            levelOrderprint(list, root.left, level - 1);
            levelOrderprint(list, root.right, level - 1);
        }

        return list;

    }
}