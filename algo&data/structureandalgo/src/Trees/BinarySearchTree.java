package Trees;

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}


public class BinarySearchTree {
    Node root;


    public boolean insert(int value){
        Node newNode =new Node(value);

        if(root == null){
            root = newNode;
            return true;
        }
        Node tmp = root;

        while(true){
            if(newNode.value == tmp.value){
                return false;
            }
            if(newNode.value < tmp.value){
                if(tmp.left ==null){
                    tmp.left = newNode;
                    return true;
                }
                tmp = tmp.left;
            }else{
                if(tmp.right ==null){
                    tmp.right = newNode;
                    return true;
                }
                tmp= tmp.right;
            }



        }


    }

    public boolean contains(int value){
        if(root == null){
            return false;
        }

        Node tmp = root;


        while(tmp != null){
            if(tmp.value > value){
                tmp = tmp.left;
            }
            else if(tmp.value < value){
                tmp = tmp.right;
            }else{
                return true;
            }

        }
        return false;
    }


}
