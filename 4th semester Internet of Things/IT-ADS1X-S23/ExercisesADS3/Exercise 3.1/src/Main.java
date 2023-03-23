public class Main {
    public static void main(String[] args) {
        BinaryLinkedNode root = new BinaryLinkedNode(1);
        BinaryLinkedNode left = new BinaryLinkedNode(2);
        BinaryLinkedNode right = new BinaryLinkedNode(3);
        root.setLeft(left);
        root.setRight(right);
        BinaryLinkedNode leftLeft = new BinaryLinkedNode(4);
        BinaryLinkedNode leftRight = new BinaryLinkedNode(5);
        left.setLeft(leftLeft);
        left.setRight(leftRight);
        BinaryLinkedNode rightLeft = new BinaryLinkedNode(6);
        BinaryLinkedNode rightRight = new BinaryLinkedNode(7);
        right.setLeft(rightLeft);
        right.setRight(rightRight);
        System.out.println("Preorder traversal:");
        preorder(root);
        System.out.println("");
        System.out.println("Inorder traversal:");
        inorder(root);
        System.out.println("");
        System.out.println("Postorder traversal:");
        postorder(root);
        System.out.println("");
    }
}