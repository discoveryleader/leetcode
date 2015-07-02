package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.


 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
 *Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1
 *
 **
 *
 *@author yanhong
 *@since July. 2, 2015 
 *
 *Method: BFS
 *
 ***/


public class InvertTree {
	public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
      if (root != null) {
          queue.add(root);
          
      }
      while (!queue.isEmpty()) {
          TreeNode  p = queue.poll();
          if (p.left != null) {
              queue.add(p.left);
              
          }
          if (p.right != null) {
              queue.add(p.right);
          }
          TreeNode temp = p.left;
          p.left = p.right;
          p.right = temp;
          
      }
      return root;
   }
}
