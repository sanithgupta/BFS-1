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
Time:O(n)
Space:O(1)

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue <TreeNode> q=new LinkedList<>();
        List <List<Integer>>result=new ArrayList<>();
        q.add(root);
        if(root==null) return new ArrayList<>();
        while(q.size()>0){
            List li=new ArrayList<Integer>();
            int count=q.size();

            for(int i=0;i<count;i++){
                TreeNode temp=q.poll();
                li.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            result.add(li);
        }
        return result;
    }
}