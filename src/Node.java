public class Node<E> {
    private E value;
    private Node<E> prev;
    private Node<E> next;

    /**
     * @param element initialize the middle value
     */
    public Node(E element){
        value = element;
    }

    /**
     * Adds value with doubly linked to have everything open
     * @param element
     * @param p
     * @param n
     */
    public Node(E element, Node<E> p, Node<E> n){
        value = element;
        prev = p;
        next = n;
    }

    /**
     * This one is just for the main testing being detailed
     * @param element
     * @param n
     */
    public Node(E element, Node<E> n){
        value = element;
        next = n;
    }

    /**
     * @return node value
     */
    public E getValue(){
        return value;
    }

    /**
     * @param element that changes value
     */
    public void setValue(E element){
        value = element;
    }

    /**
     * @return prev node of the value
     */
    public Node<E> getPrevNode(){
        return prev;
    }

    /**
     * @return next node of the value
     */
    public Node<E> getNextNode(){
        return next;
    }

    /**
     * @param p previous node that changes value
     */
    public void setPrevNode(Node<E> p){
        prev = p;
    }

    /**
     * @param n next node that changes value
     */
    public void setNextNode(Node<E> n){
        next = n;
    }

    /**
     * @return string value of the core node
     */
    public String toString(){
        String str = String.valueOf(value);
        return str;
    }

    /**
     * @param node
     * @return true if param = actual node
     */
    public boolean equals(Node<E> node){
        if (node.equals(value)){
            return true;
        }
        return false;
    }
}
