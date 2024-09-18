import org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;


public class TesteHeap {

    private Heap heap;

    @Before
    public void setUp() {
        // Inicializa uma heap com capacidade inicial de 5
        heap = new Heap(5);
    }

    @Test
    public void testHeapStartsEmpty() {
        assertTrue(heap.isEmpty());
    }

    @Test
    public void testAddElement() {
        heap.add(10);
        assertFalse(heap.isEmpty());
    }

    @Test
    public void testHeapMaintainsMaxHeapProperty() {
        heap.add(10);
        heap.add(20);
        heap.add(5);
        assertEquals(20, heap.remove());
        assertEquals(10, heap.remove());
        assertEquals(5, heap.remove());
    }

    @Test
    public void testHeapResize() {
        heap.add(10);
        heap.add(20);
        heap.add(5);
        heap.add(30);
        heap.add(40);
        heap.add(50); // Deverá acionar o resize aqui

        assertEquals(50, heap.remove());
        assertEquals(40, heap.remove());
    }

    @Test
    public void testRemoveFromEmptyHeap() {
        try {
            heap.remove();
            fail("Expected RuntimeException when removing from empty heap");
        } catch (RuntimeException e) {
            assertEquals("Empty", e.getMessage());
        }
    }

    @Test
    public void testBuildHeap() {
        int[] array = {10, 20, 5, 15, 30};
        Heap heapFromArray = new Heap(array);

        assertEquals(30, heapFromArray.remove());
        assertEquals(20, heapFromArray.remove());
        assertEquals(15, heapFromArray.remove());
        assertEquals(10, heapFromArray.remove());
        assertEquals(5, heapFromArray.remove());
    }

    @Test
    public void testHeapifyAfterRemove() {
        heap.add(10);
        heap.add(20);
        heap.add(5);
        heap.add(7);
        heap.add(3);
        
        assertEquals(20, heap.remove()); // Remove o maior
        assertEquals(10, heap.remove()); // O segundo maior deve vir ao topo
        assertEquals(7, heap.remove());  // Verifica a ordem restante
    }
}

