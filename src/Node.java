public class Node<E> {
    private E value;
    private Node<E> prev;
    private Node<E> next;

    public Node(E element){
        value = element;
    }

    public Node(E element, Node<E> p, Node<E> n){
        value = element;
        prev = p;
        next = n;
    }
    public Node(E element, Node<E> n){
        value = element;
        next = n;
    }

    public E getValue(){
        return value;
    }
    public void setValue(E element){
        value = element;
    }
    public Node<E> getPrevNode(){
        return prev;
    }
    public Node<E> getNextNode(){
        return next;
    }
    public void setPrevNode(Node<E> p){
        prev = p;
    }
    public void setNextNode(Node<E> n){
        next = n;
    }
    public String toString(){
        String str = String.valueOf(value);
        return str;
    }
    public boolean equals(Node<E> node){
        if (node.equals(value)){
            return true;
        }
        return false;
    }
}
