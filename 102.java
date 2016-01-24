// https://leetcode.com/problems/binary-tree-level-order-traversal/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        levelSort(root, 0, levels);

        return levels;
    }

    private void levelSort(TreeNode root, int level, List<List<Integer>> levels) {
        if (root == null) return;

        if (level >= levels.size()) {
            levels.add(new ArrayList<>());
        }

        List<Integer> list = levels.get(level);

        list.add(root.val);
        levelSort(root.left, level + 1, levels);
        levelSort(root.right, level + 1, levels);
    }
}
