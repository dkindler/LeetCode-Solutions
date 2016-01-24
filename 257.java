// https://leetcode.com/problems/binary-tree-paths/
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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> result = new ArrayList<>();
        if (root == null) return result;

        binaryRecursive(root, new StringBuilder(), result);
        return result;
    }

    public void binaryRecursive(TreeNode root, StringBuilder current, List<String> list) {

        if (current.length() == 0) {
            current.append(root.val);
        } else {
            current.append("->" + root.val);
        }

        if (root.left == null && root.right == null && current.toString() != "") {
            list.add(current.toString());
        }

        int oldLength = current.length();
        if (root.left != null) binaryRecursive(root.left, current, list);
        current.setLength(oldLength);
        if (root.right != null) binaryRecursive(root.right, current, list);
    }
}
