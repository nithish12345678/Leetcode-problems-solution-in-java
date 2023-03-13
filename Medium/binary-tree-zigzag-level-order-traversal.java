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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int h = height(root);
        ans = new ArrayList<List<Integer>>();
        System.out.println(h);
        for (int i = 1; i <= h; i++) {
            List<Integer> list = new ArrayList<>();
            // another i is to have the level as we are modifying one level
            ans.add(levelOrderprint(list, root, i, i));
        }
        return ans;
    }

    public List<Integer> levelOrderprint(List<Integer> list, TreeNode root, int level, int l) {
        if (root == null) {
            return list;
        }
        if (level == 1) {
            list.add(root.val);
            System.out.println(root.val);
        }
        if (level > 1) {
            // just print root.right first for levels divisible by 2

            if (l % 2 == 0) {
                levelOrderprint(list, root.right, level - 1, l);
                levelOrderprint(list, root.left, level - 1, l);
            } else {
                levelOrderprint(list, root.left, level - 1, l);
                levelOrderprint(list, root.right, level - 1, l);
            }
        }
        return list;
    }
}