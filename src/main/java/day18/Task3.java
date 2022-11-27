package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        addNew(14,root);
        addNew(23,root);
        addNew(11,root);
        addNew(16,root);
        addNew(22,root);
        addNew(27,root);
        addNew(5,root);
        addNew(15,root);
        addNew(18,root);
        addNew(24,root);
        addNew(150,root);
        addNew(8,root);

        dfs(root);
    }

    public static void addNew (int value, Node root){
        Node newNode = new Node(value);
        Node parent = root;
        Node tempRoot;
        while (true){
            if (value < parent.getValue()){
                tempRoot = parent.getLeftChild();
                if (tempRoot == null){
                    parent.setLeftChild(newNode);
                    return;
                }
            } else {
                tempRoot = parent.getRightChild();
                if (tempRoot == null){
                    parent.setRightChild(newNode);
                    return;
                }
            }
            parent = tempRoot;
        }
    }
    public static void dfs(Node root){

        if (root.getLeftChild() != null){
            dfs(root.getLeftChild());
        }
        System.out.print(root.getValue()+" ");

        if (root.getRightChild() != null){
            dfs(root.getRightChild());
        }
    }
}