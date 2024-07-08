import java.util.Scanner;
import java.util.Arrays;

public class MoveImpostor {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String[] sequencia = sc.nextLine().split(" ");	
	int valorAtual = 0;
	int menorValor = 0;


	for(int i = 0; i < sequencia.length -1; i++) {
		if(Integer.parseInt(sequencia[i]) > Integer.parseInt(sequencia[i+1])) {
			menorValor = Integer.parseInt(sequencia[i+1]);
			for(int j = i; j >= 0; j--) {
				if(menorValor < Integer.parseInt(sequencia[j])) {
					valorAtual = Integer.parseInt(sequencia[j]);
					sequencia[j] = sequencia[j+1];
					sequencia[j+1] = valorAtual + "";
				}
			}
			
			break;

		}
	}

	System.out.println(Arrays.toString(sequencia));
	}

}
