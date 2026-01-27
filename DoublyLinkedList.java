public class DoublyLinkedList<E> implements List<E>{
    private Node<E> head;


    /**
     * @param element element to add to the list, make sure head is not null
     */
    public void add(E element) {
        if(head == null){
            head = new Node<>(element);
            return;
        }
        Node<E> node = head;
        while (node.getNextNode() != null){
            node = node.getNextNode();
        }
        Node newNode = new Node(element);
        //balancing out the nodes and connecting them
        node.setNextNode(newNode);
        newNode.setNextNode(node);
    }

    /**
     * @param i       index of the element
     * @param element element to add to the list
     * @throws IndexOutOfBoundsException
     * added at specific place using count vs. i
     */
    public void add(int i, E element) throws IndexOutOfBoundsException{
        if(head == null){
            head = new Node<>(element);
            return;
        }
        Node<E> node = head;
        int count = 0;
        Node newNode = null;
        while (node.getNextNode() != null){
            if (count == i){
                newNode = new Node(element);
                break;
            }
            count++;
            node = node.getNextNode();
        }
        if (i > count){
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
        }
        node.setNextNode(newNode);
        newNode.setNextNode(node);
    }

    /**
     * Removes the last one of the nodes, checks until one is null
     */
    public void remove() {
        if(head == null){
            return;
        }
        Node<E> node = head;
        while (node.getNextNode() != null){
            node.setValue(null);
            node = node.getNextNode();
        }
        node.setValue(null);

    }
    /**
     * Remove element at index i
     * If index is invalid, throws IndexOutOfBoundsException
     * @param i index of the element to remove
     * @return the element that was removed
     */
    public Node remove(int i) throws IndexOutOfBoundsException{
        if(head == null){
            return head;
        }
        Node<E> node = head;
        int count = 0;
        Node newNode = null;
        while (node.getNextNode() != null){
            if (count == i){
                newNode = new Node(node.getValue());
                node.setValue(null);
                break;
            }
            count++;
            node = node.getNextNode();
        }
        if (i > count){
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
        }
        node = node.getNextNode();
        return newNode;
    }
    /**
     * Gets the element at index i
     * If index is invalid, throws IndexOutOfBoundsException
     * @param i index of the element
     * @return the element
     */
    public Node<E> get(int i) throws IndexOutOfBoundsException{
        if(head == null){
            return head;
        }
        Node<E> node = head;
        Node newNode = null;
        int count = 0;
        while (node.getNextNode() != null){
            if (count == i){
                newNode = new Node(node.getValue());
                break;
            }
            count++;
            node = node.getNextNode();
        }
        if (i > count){
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
        }
        return newNode;
    }

    /**
     * Sets the element at i to a new value
     * If index is invalid, throws IndexOutOfBoundsException
     * @param i index of the element to set
     * @param element new value of the element
     */
    public void set(int i, E element) throws IndexOutOfBoundsException{
        if (size() < i) {
            throw new IndexOutOfBoundsException("Index " + i + " is out of bounds");
        }
        if(head == null){
            head = new Node<>(element);
            return;
        }
        Node<E> node = head;
        int count = 0;
        while (node.getNextNode() != null) {
            if (count == i) {
                node = new Node(element);
                break;
            }
            count++;
            node = node.getNextNode();
        }
    }

    /**
     *  Find and return the size of the node by iterating through it
     *  @return count
     */
    public int size() {
        Node<E> node = head;
        int count = 0;
        while (node.getNextNode() != null){
            count++;
            node = node.getNextNode();
        }
        return count;
    }

    /**
     * Check if list and head is empty
     * @return true if empty false if not
     */
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
    }

    /**
     * @return String of nodes
     */
    public String toString() {
        String str = "[";
        for (int i = 0; i < size(); i++) {
            str += get(i) + ", ";
        }
        str += "]";
        return str;
    }
}
