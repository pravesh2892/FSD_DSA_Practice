package tree.postclass;

public class Delete_kth_smallest_node_in_BST {
    /*
class Node
{
    int data;
    Node left, right;
    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

    static Node deleteKthSmallest(Node root,int k)
    {
        int tgt = kthSmallestInBST(root,k);
        return deleteInBST(root,tgt);
    }
    public static int kthSmallestInBST(Node root, int k) {

        ArrayList<Integer> al = new ArrayList<>();
        helper(root, k, al);
        return al.get(k-1);

    }
    public static void helper(Node root, int k, ArrayList<Integer> al){
        if(root==null){
            return;
        }
        //inorder traversal
        helper(root.left,k, al);
        if(root!=null){
            al.add(root.data);
        }
        helper(root.right,k, al);
    }


    public static Node deleteInBST(Node root, int x)
    {
        // Your code here
        if (root == null) {
            return root;
        }

        // Traverse down the tree to find the node with value 'x'
        if (x < root.data) {
            root.left = deleteInBST(root.left, x);
        } else if (x > root.data) {
            root.right = deleteInBST(root.right, x);
        } else {
            // Node to be deleted is found
            // Case 1: Node has no children or only one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node has two children
            // Find the minimum value node in the right subtree (or maximum value node in the left subtree)
            root.data = minValue(root.right);

            // Delete the minimum value node in the right subtree
            root.right = deleteInBST(root.right, root.data);
        }

        return root;
    }
    public static int minValue(Node root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }
}
