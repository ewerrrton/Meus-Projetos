import java.util.Scanner;
import java.util.Arrays;

public class TesteInserePrimeiro {
	
	public static void main(String[] args) {
	Scanner sc=  new Scanner(System.in);
	String[] sequencia = sc.nextLine().split(" ");
	int[] sequenciaint = new int[sequencia.length];

	for(int i =0; i < sequencia.length; i++) {
		sequenciaint[i] = Integer.parseInt(sequencia[i]);
	}

	TesteInserePrimeiro t = new TesteInserePrimeiro();

	int[] resultado = t.inserePrimeiroOrdenado(sequenciaint);
	System.out.println(Arrays.toString(resultado));
	}


	public int[] inserePrimeiroOrdenado(int[] v) {
        
	int firstElement = v[0];
	int i = 1;

	while(i < v.length && v[i] < firstElement) {
		v[i-1] = v[i];
		i++;
	}

	v[i-1] = firstElement;
	
	return v;
    }
}
