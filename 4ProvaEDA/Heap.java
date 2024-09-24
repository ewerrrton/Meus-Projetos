public class Heap {
    
    private int[] heap;
    private int tail;


    public Heap(int capacidade) {
        this.heap = new int[capacidade];
        this.tail = -1;
    }

    public boolean isEmpty() {
        return this.tail == -1;
    }

    public int left(int index) {
        return 2 * index +1;
    }

    public int right(int index) {
        return 2 * (index + 1);
    }

    public int parent(int index) {
        return (index-1)/2;
    }

    public void add(int element) {
        // resize if is full
        //
        this.tail++;
        this.heap[tail] = element;
        

        int i = tail;
        while(i > 0 && this.heap[i] > this.heap[parent(i)]) {
            int aux = this.heap[i];
            this.heap[i] = this.heap[parent(i)];
            this.heap[parent(i)] = aux;
            i = parent(i);
        }

    }

    public int remove() {
        if(isEmpty()) {
            throw new RuntimeException();
        }
        
        int element = this.heap[0];
        this.heap[0] = this.heap[tail];
        this.tail--;

        this.heapify(0);
        return element;
    }

    public void heapify(int index) {
        if(isLeaf(index) || !isValidIndex(index)) {
            return;
        }
        
        int indexMax = maxIndex(index, left(index), right(index));

        if(indexMax != index) {
            swap(index, indexMax);
            heapify(indexMax);
        }
    }

    private int maxIndex(int i, int l, int r) {
        if(this.heap[i] > this.heap[left]) {
            if(isValidIndex(r)) {
                if(this.heap[i] < this.heap[r]) {
                    return r;
                } 
            }

            return i;
        } else {
            if(isValidIndex(r)) {
                if(this.heap[l] < this.heap[r]) {
                    return r;
                }
            }
            return l;
        }
    }

    private boolean isValidIndex(int index) {
        return index >=0 && index <= tail;
    }


    private boolean isLeaf(int index) {
        return index > parent(tail) && index <= tail;
    }

    private void swap(int i, int j) {
        int aux = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = aux;
    }
    
    public Heap(int[] heap) {
        this.heap = heap;
        this.tail = this.heap.length-1;
        this.buidHeap();
    }

    private void buildHeap() {
        for(int i = parent(tail); i >= 0; i--) {
            heapify(i);

        }
    }


}   
