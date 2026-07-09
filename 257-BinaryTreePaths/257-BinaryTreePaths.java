// Last updated: 09/07/2026, 15:10:27
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, "");
        return result;
    }

    private void dfs(TreeNode node, String path) {

        if (node == null)
            return;

        if (path.isEmpty())
            path = String.valueOf(node.val);
        else
            path += "->" + node.val;

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        dfs(node.left, path);
        dfs(node.right, path);
    }
}