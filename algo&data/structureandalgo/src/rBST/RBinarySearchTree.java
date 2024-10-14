package rBST;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}

public class RBinarySearchTree {

    Node root;

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = rInsert(currentNode.right, value);
        }
        return currentNode;
    }

    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);

    }


    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;

        if (value < currentNode.value) {
            currentNode.left = deleteNode(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = deleteNode(currentNode.right, value);
        } else {
            if (currentNode.left == null && currentNode.right == null) {
                return null;
            } else if (currentNode.left == null) {
                currentNode = currentNode.right;
            } else if (currentNode.right == null) {
                currentNode = currentNode.left;
            }else{
                int subTreeMin = minVlaue(currentNode.right);
                currentNode.value = subTreeMin;
                currentNode.right= deleteNode(currentNode.right, subTreeMin);
            }

        }
        return currentNode;
    }


    public int minVlaue (Node currentNode){
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }

        return currentNode.value;
    }

    public void deleteNode(int value) {
        deleteNode(root, value);
    }


    private boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }

    }

    public boolean rContains(int value) {
        return rContains(root, value);
    }
}
