package trees;

import java.util.Arrays;

/**
 * Created by Mehari on 6/23/18.
 */
public class BinaryHeap {
    public int[] data;
    public int size=0;
    private int capacity=10;

    public BinaryHeap(){
        data = new int[capacity];
    }

    public int getParentIndex(int index){
        int i = ((index + 1) / 2) - 1;
        return sanitizeIndex(i);

    }

    private int sanitizeIndex(int i) {
        return (i<0 || i>data.length-1)?-1:i;
    }

    public int getLeftIndex(int index){
        int i = (2*(index+1))-1;
        return sanitizeIndex(i);
    }
    public int getRightIndex(int index){
        int leftIndex = getLeftIndex(index);
        if(leftIndex==-1)return leftIndex;
        int i = leftIndex +1;
        return sanitizeIndex(i);
    }

    public void heapifyUp(){
        int i= size-1;
        while(i>=0){
            int parentIndex = getParentIndex(i);
            if(parentIndex!=-1 && data[parentIndex]<data[i]){
                swap(parentIndex,i);
            }
            i--;
        }
    }
    public void heapfiyDown(){
        int i = 0;
        while (i<size){
            int leftIndex = getLeftIndex(i);
            int rightIndex = getRightIndex(i);
            int maxIndex = leftIndex;
            if(!(leftIndex==-1 && rightIndex==-1)){
                if (leftIndex == -1 && rightIndex != -1){
                    maxIndex = rightIndex;
                }
                if(leftIndex!=-1 && rightIndex==-1){
                    maxIndex=leftIndex;
                }
                if (leftIndex != -1 && rightIndex != -1) {
                    int left = data[leftIndex];
                    int right = data[rightIndex];
                    if (right > left) maxIndex = rightIndex;
                }

                if (data[i] < data[maxIndex]) {
                    swap(i, maxIndex);
                }

            }

            i++;
        }
    }
    private void swap(int index1, int index2){
        int temp = data[index1];
        data[index1]=data[index2];
        data[index2]=temp;
    }

    public int peek(){
        return data[0];
    }

    public void enqueue(int i) {
        checkCapacity();
        size++;
        data[size - 1] = i;
        heapifyUp();
    }
    public int dequeue(){
        int head = data[0];
        data[0]=data[size-1];
        data[size-1]=0;
        size--;
        heapfiyDown();
        return head;
    }
    private void checkCapacity(){
        if(size==capacity){
            data = Arrays.copyOf(data, 2*capacity);

        }
    }
}
