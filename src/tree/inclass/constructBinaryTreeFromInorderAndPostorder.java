package tree.inclass;

public class constructBinaryTreeFromInorderAndPostorder {
    /* public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node(int data) {
            this.data = data;
        }
    }
*/

    static Node buildTree(ArrayList<Integer> inorder, ArrayList<Integer> postorder) {
        if(inorder.isEmpty() || postorder.isEmpty()){
            return null;
        }
        int value=postorder.get(postorder.size()-1);
        Node root = new Node(value);
        int rootIndex = inorder.indexOf(value);

        ArrayList<Integer>leftInorder =new ArrayList<>(inorder.subList(0,rootIndex));
        ArrayList<Integer>rightInorder =new ArrayList<>(inorder.subList(rootIndex+1, inorder.size()));

        ArrayList<Integer>leftPostorder = new ArrayList<>(postorder.subList(0, rootIndex));
        ArrayList<Integer>rightPostorder = new ArrayList<>(postorder.subList(rootIndex, postorder.size()-1));

        root.left= buildTree(leftInorder, leftPostorder);
        root.right = buildTree(rightInorder, rightPostorder);
        return root;


    }
}
