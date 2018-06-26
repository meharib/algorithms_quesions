package trees;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/23/18.
 */
public class BinaryHeapTest {

    @Test
    public void testHeapfiyDown() throws Exception {
        BinaryHeap binaryHeap = new BinaryHeap();
        binaryHeap.data=new int[]{16,14,10,8,7,9,3,2,4,1};
        binaryHeap.heapfiyDown();
        System.out.println(Arrays.toString(binaryHeap.data));

    }
    @Test
    public void testEnqueue() throws Exception {
        BinaryHeap binaryHeap = new BinaryHeap();
        binaryHeap.enqueue(10);
        binaryHeap.enqueue(8);
        binaryHeap.enqueue(7);
        binaryHeap.enqueue(14);
        binaryHeap.enqueue(16);
        binaryHeap.enqueue(9);
        binaryHeap.enqueue(3);
        binaryHeap.enqueue(2);
        binaryHeap.enqueue(4);
        binaryHeap.enqueue(1);
        System.out.println(Arrays.toString(binaryHeap.data));

        while (binaryHeap.size>0){
            System.out.println(binaryHeap.dequeue());
        }

    }
}