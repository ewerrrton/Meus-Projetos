public class BST {

    private Node root;

    public boolean isEmpty{
        return this.root == null;
    }

    public void add(int element) {
        if(isEmpty()) {
            this.root = new Node(value);
        }
        
        Node novoNo = new Node(element);
        else {
            Node aux = this.root;

            while(aux != null) {
                if(element < aux.value) {
                    if(aux.left == null) {
                        aux.left = novoNo;
                        novoNo.parent = aux;
                        return;
                    }    
                    aux = aux.left;
                
                } else {

                    if(aux.left == null) {
                        aux.left = novoNo;
                        novoNo.parent = aux;
                        return;
                    }
                }

                aux = aux.left;
            }
        }
    }

    public Node search(int element) {
        return search(element, this.root);
    }

    private Node search(int element, Node node) {
        
        if(node == null) {
            return null;
        }

        if(node.value == element) {
            return node;
        }

        if(element < node.value) {
            return search(element, node.left);
        }

        else {
            return search(element, node.right);
        }
    }

    public Node min() {
        if(isEmpty()) {
            return null
        }
        return min(this.root);
    }

    private Node min(Node node) {
        if(node.left == null) {
            return node;
        }

        else {
            return min(node.left);
        }
    }

    public Node max() {
        return max(this.root);
    }

    private Node max(Node node) {
        if(isEmpty()) {
            return null;
        }

        else {
            return max(node.right);
        }
    }
        
    public Node sucessor(Node node) {
        if(node == null) {
            return null;
        }
        
        if(node.right != null) {
            return min(node.right);
        }

        else {
            Node aux = node.parent;

            while(aux != null && aux.value < node.value) {
                aux = aux.parent;
            }

            return aux;
        }
    }

    public Node predecessor(Node node) {
        
        if(node == null){
            return null;
        }

        if(node.left != null) {
            return max(node.left);
        }
        else {
            Node aux = node.parent;

            while(aux != null && aux.value > node.value) {
                aux = aux.parent;
            }

            return aux;
        }
    }

    public int height() {
        return height(this.root);
    }

    private int height(Node node) {
        if(node == null) {
            return -1;
        }

        else {
            return 1 + Math.max(height(node.left), height(node.right));
        }
    }

    public Node remove(Node toRemove) {
     
        if(toRemove.isLeaf()) {
            if(toRemove == this.root) {
                this.root = null;
            
            } else{
                if(toRemove.value < toRemove.parent.value) {
                    toRemove.parent.left = null;
                } else {
                    toRemove.parent.right = null;
                }
            }
        } else if(toRemove.hasOnlyLeftChild()) {
            if(toRemove == this.root) {
                this.root = toRemove.left;
                this.root.parent = null;
            
            } else {
                toRemove.left.parent = toRemove.parent;
                if(toRemove.value < toRemove.parent.value) {
                    toRemove.parent.left = toRemove.left;
                } else {
                    toRemove.parent.right = toRemove.right;
                }
            }
        } else if(toRemove.hasOnlyLeftChild()) {
            if(toRemove == this.root) {
                this.root = toRemove.right;
                this.root.parentt = null;

            } else {
                toRemove.right.parent = toRemove.parent;
                if(toRemove.value < toRemove.parent) {
                    toRemove.parent.left = toRemove.left;
                } else {
                    toRemove.parent.right = toRemove.right;
                }
            }
        }

        else {
            Node sucessor = sucessor(toRemove);
            toRemove.value = sucesspr.value;
            remove(sucessor);
        }
        
    }



   
            





}


public Node { 
    
    private Node parent;
    private int value;
    private Node right;
    private Node left;

    public Node(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean hasOnlyLeftChild() {
        return left != null && right == null;
    }

    public boolean hasOnlyRightChild() {
        return left == null && right != null;
    }

}
