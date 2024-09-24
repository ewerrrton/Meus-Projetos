public class SelectionSort {

    public void sort(int[] v) {
        int n = v.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (v[j] < v[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int aux = v[i];
                v[i] = v[minIndex];
                v[minIndex] = aux;
            }
        }
    }

    public void sortRecursivo(int[] v) {
        sortRecursivo(v, 0);
    }

    private void sortRecursivo(int[] v, int i) {
        int n = v.length;
        if (i >= n - 1) {
            return;
        }

	int minIndex = findMinIndex(v, i + 1, i);
        if (minIndex != i) {
            int aux = v[i];
            v[i] = v[minIndex];
            v[minIndex] = aux;
        }
        sortRecursivo(v, i + 1);
    }

    private int findMinIndex(int[] v, int j, int minIndex) {
        if (j >= v.length) {
		return minIndex;
        }
        if (v[j] < v[minIndex]) {
            minIndex = j;
        }
        return findMinIndex(v, j + 1, minIndex);
	
    }
}
