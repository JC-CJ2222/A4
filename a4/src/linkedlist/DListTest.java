package linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DListTest {

    @Test
    public void testConstructor() {
        DList<Integer> d= new DList<>();
        assertEquals("[]", d.toString());
        assertEquals("[]", d.toStringR());
        assertEquals(0, d.size());
    }

    @Test
    public void testPrependAndToString() {
        DList<String> d1= new DList<>();
        d1.prepend("2110");
        assertEquals("[2110]", d1.toString());
        assertEquals("[2110]", d1.toStringR());
        assertEquals(1, d1.size());

        DList<String> d2= new DList<>();
        d2.prepend("");
        d2.prepend("");
        assertEquals("[, ]", d2.toString());
        assertEquals("[, ]", d2.toStringR());
        assertEquals(2, d2.size());
    }

    @Test
    public void testAppendAndToString() {
        DList<Integer> d1= new DList<>();
        d1.append(2);
        assertEquals("[2]", d1.toString());
        assertEquals("[2]", d1.toStringR());
        assertEquals(1, d1.size());

        d1.append(1);
        d1.append(1);
        d1.append(0);
        assertEquals("[2, 1, 1, 0]", d1.toString());
        assertEquals("[0, 1, 1, 2]", d1.toStringR());
        assertEquals(4, d1.size());
    }

    @Test
    public void testGetNode() {
        DList<Integer> d1= new DList<>();
        d1.append(1);
        assertEquals(1, d1.getNode(0).value());
        d1.prepend(2);
        assertEquals(2, d1.getNode(0).value());
        d1.append(1);
        d1.append(0);
        assertEquals(0, d1.getNode(3).value());
        assertEquals(4, d1.size());
    }

    @Test
    public void insertAfter() {
        DList<Integer> d1= new DList<>();
        d1.append(1);
        d1.append(3);
        d1.insertAfter(2, d1.getNode(0));
        assertEquals("[1, 2, 3]", d1.toString());
        assertEquals("[3, 2, 1]", d1.toStringR());
        assertEquals(3, d1.size());

        d1.insertAfter(4, d1.getNode(2));
        assertEquals("[1, 2, 3, 4]", d1.toString());
        assertEquals("[4, 3, 2, 1]", d1.toStringR());
        assertEquals(4, d1.size());

        DList<String> d2= new DList<>();
        d2.prepend("");
        d2.insertAfter("5", d2.getNode(0));
        assertEquals("[, 5]", d2.toString());
        assertEquals("[5, ]", d2.toStringR());
        assertEquals(2, d2.size());
    }

}
