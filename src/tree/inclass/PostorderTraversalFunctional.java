package tree.inclass;

public class PostorderTraversalFunctional {
    /*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

    public static void postorderTraversal(Node node) {
        if(node==null){
            return;
        }
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.print(node.data+" ");
    }
}
