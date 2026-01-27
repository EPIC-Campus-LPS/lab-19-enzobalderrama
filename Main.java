public class Main {

    public static void main(String[] args){
        Node<String> first = new Node<>("obtuse");

        Node<String> next = new Node<>("rubber goose");
        first.setNextNode(next);
        next.setPrevNode(first);
        System.out.println(next);
        System.out.println(first);
        Node<String> prev = new Node<>("giant snake");

        Node<String> after = new Node<>("guava juice", next, prev);
        System.out.println(after);
        next.setNextNode(after);
        System.out.println(after.getPrevNode().getValue()); // "rubber goose"
        System.out.println(next.equals(prev));
    }
}
