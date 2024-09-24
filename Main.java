import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SelectionSort sorter = new SelectionSort();

        System.out.println("Digite o número de elementos:");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Array antes da ordenação:");
        printArray(array);

        // Ordena o array usando o método recursivo
        sorter.sortRecursivo(array);

        System.out.println("Array após a ordenação recursiva:");
        printArray(array);

        scanner.close();
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
