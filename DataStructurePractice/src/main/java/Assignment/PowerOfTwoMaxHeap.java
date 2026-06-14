package Assignment;

import java.util.ArrayList;

public class PowerOfTwoMaxHeap {
    private ArrayList<Integer> heap;
    private int childExponent;
    private int childPerNode;

    public PowerOfTwoMaxHeap(int childExponent) {
        if (childExponent < 0 || childExponent > 10) {
            throw new IllegalStateException("Exponent must be between 0 and 10.");

        }
        this.childExponent = childExponent;
        this.childPerNode = (int) Math.pow(2, childExponent);
        this.heap = new ArrayList<>();

    }

    public int popMax() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty.");
        int max = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            moveDown(0);
        }
        return max;
    }

    public void insert(int value) {
        heap.add(value);
        moveUp(heap.size() - 1);
    }

    private void moveUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / childPerNode;
            if (heap.get(index) > heap.get(parent)) {
                swap(index, parent);
                index = parent;
            } else {
                break;
            }
        }
    }

    private void moveDown(int index) {
        int size = heap.size();
        while (true) {
            int largest = index;
            for (int i = 1; i <= childPerNode; i++) {
                int child = index * childPerNode + i;
                if (child < size && heap.get(child) > heap.get(largest)) {
                    largest = child;
                }
            }
            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public int peekMax() {
        if (heap.isEmpty()) throw new IllegalStateException("Heap is empty.");
        return heap.get(0);
    }
    public static void main(String[] args) {
        PowerOfTwoMaxHeap heap = new PowerOfTwoMaxHeap(2);
        int[] numbers = {50, 20, 70, 10, 90, 30, 60};
        for (int num : numbers) {
            heap.insert(num);
        }

        while (!heap.isEmpty()) {
            System.out.print(heap.popMax() + " ");
        }

    }

}



