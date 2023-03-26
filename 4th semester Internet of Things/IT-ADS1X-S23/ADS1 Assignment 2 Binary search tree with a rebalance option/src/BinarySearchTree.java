
public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = _insert(root, value);
    }

    private Node _insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value < node.value) {
            node.left = _insert(node.left, value);
        } else {
            node.right = _insert(node.right, value);
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    public void remove(int value) {
        root = _remove(root, value);
    }

    private Node _remove(Node node, int value) {
        if (node == null) {
            return node;
        }
        if (value < node.value) {
            node.left = _remove(node.left, value);
        } else if (value > node.value) {
            node.right = _remove(node.right, value);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                Node temp = getMin(node.right);
                node.value = temp.value;
                node.right = _remove(node.right, temp.value);
            }
        }
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    public boolean search(int value) {
        return _search(root, value);
    }

    private boolean _search(Node node, int value) {
        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        } else if (value < node.value) {
            return _search(node.left, value);
        } else {
            return _search(node.right, value);
        }
    }

    public int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return node.height;
    }

    public Node getMin(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void rebalance() {
        root = _rebalance(root);
    }

    private Node _rebalance(Node node) {
        if (node == null) {
            return null;
        }

        int balance = getHeight(node.left) - getHeight(node.right);
        if (balance > 1) {
            if (getHeight(node.left.left) >= getHeight(node.left.right)) {
                node = rotateRight(node);
            } else {
                node.left = rotateLeft(node.left);
                node = rotateRight(node);
            }
        } else if (balance < -1) {
            if (getHeight(node.right.right) >= getHeight(node.right.left)) {
                node = rotateLeft(node);
            } else {
                node.right = rotateRight(node.right);
                node = rotateLeft(node);
            }
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        return node;
    }

    private Node rotateLeft(Node node) {
        Node newRoot = node.right;
        node.right = newRoot.left;
        newRoot.left = node;
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        newRoot.height = Math.max(getHeight(newRoot.left), getHeight(newRoot.right)) + 1;
        return newRoot;
    }

    private Node rotateRight(Node node) {
        Node newRoot = node.left;
        node.left = newRoot.right;
        newRoot.right = node;
        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        newRoot.height = Math.max(getHeight(newRoot.left), getHeight(newRoot.right)) + 1;
        return newRoot;
    }

    public void inorder() {
        _inorder(root);
    }

    private void _inorder(Node node) {
        if (node == null) {
            return;
        }
        _inorder(node.left);
        System.out.print(node.value + " ");
        _inorder(node.right);
    }
}
