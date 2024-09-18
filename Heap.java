public class Heap {
    
    private int[] heap;
    private int tail;


    public void Heap(int capacidade) {
        this.heap = new int[capacidade];
        this.tail = -1;
    }


    public boolean isEmpty() {
        return this.tail == -1;
    }

    public boolean isFull() {
        return this.tail+1 == this.heap.length;
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * (i+1);
    }

    public int parent(int i) {
        return (i-1)/2;
    }


    public void add(int elemento) {
        if(isFull()) {
            resize();
        }
        this.tail++;
        this.heap[tail] = elemento;

        int i = this.tail;
        while(i > 0 && this.heap[i] > this.heap[parent(i)]) {
            int aux = this.heap[i];
            this.heap[i] = this.heap[(parent(i))];
            this.heap[parent(i)] = aux;
            i = parent(i);
        }
    }

    public int remove() {
        if(isEmpty()) {
            throw new RuntimeException("Empty");
        }

        int removido = this.heap[0];
        this.heap[0] = this.heap[tail];
        this.tail--;

        this.heapify(0);
        
        return removido;
        
    }


    private void heapify(int i) {
        if(isLeaf(i) || !isValidIndex(i)) {
            return;
        }
    
    
        int indexMaior = getIndexMax(i, left(i), right(i)); 
       
        if(indexMaior!= i) {
            swap(i,indexMaior);
            heapify(indexMaior);
        }
    }

    public void swap(int i, int j) {
        int aux = this.heap[i];
        this.heap[i] = this.heap[j];
        this.heap[j] = aux;
    }

    public int getIndexMax(int i, int left, int right) {
        
        if(this.heap[i] > this.heap[left]) {
            if(isValidIndex(right)) {
                if(this.heap[i] < this.heap[right]) {
                    return right;
                }
            }
            
            return i;
            
        } else {
            if(isValidIndex(right)) {
                if(this.heap[left] < this.heap[right]) {
                    return right;
                }
            }

            return left;
        }
    }

    public boolean isLeaf(int i) {
        return i > parent(tail) && i <= tail;
    }

    public boolean isValidIndex(int i) {
        return i >= 0 && i <= tail;
    }

    public void resize() {
        int[] newHeap = new int[this.heap.length * 2];

        for(int i = 0; i < this.heap.length; i++) {
            newHeap[i] = heap[i];
        }

        this.heap = newHeap;     
    }

    public void Heap(int[] heap) {
        this.heap = heap;
        this.tail = this.heap.length-1;
        this.buildHeap();
    }

    private void buildHeap() {
        for(int i = parent(tail); i >= 0; i--) {
            heapify(i);
        }
    }


}
