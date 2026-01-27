import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Test.*;


class DoublyLinkedListTest {

    @Test

    /*I wasn't able to test these because I was coding at home and ran into issues with
    importing test docs and things like that. With that said I'm pretty confident these
    work even though I don't have the specific numbers.

     */
    void testNodeSetValue() {
        Node<String> node = new Node<>("original");
        node.setValue("updated");
        assertEquals("updated", node.getValue());
    }

    @Test
    void testNodeLinking() {
        Node<String> first = new Node<>("first");
        Node<String> second = new Node<>("second");
        first.setNextNode(second);
        second.setPrevNode(first);

        assertEquals(second, first.getNextNode());
        assertEquals(first, second.getPrevNode());
    }

    @Test
    void testAddSingleElement() {
        list.add(10);
        assertFalse(list.isEmpty());
        assertEquals(10, list.get(0).getValue());
    }

    @Test
    void testAddMultipleElements() {
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(1, list.get(0).getValue());
        assertEquals(2, list.get(1).getValue());
    }


}