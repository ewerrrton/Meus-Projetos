import java.util.Scanner;

public class DownN {	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);


	String[] sequencia = sc.nextLine().split(" ");
	int n = sc.nextInt();

	int tamanhoArray = sequencia.length;

	for(int i = 0; i < tamanhoArray-1; i++) {
		for(int j = 0; j < tamanhoArray-i-1; j++) {
			if(Integer.parseInt(sequencia[j]) > Integer.parseInt(sequencia[j+1])) {
				String varAux = sequencia[j];
				sequencia[j] = sequencia[j+1];
				sequencia[j+1] = varAux;
			}
		}	
	}

	StringBuilder sb = new StringBuilder();
	for(int i = 0; i < n; i++) {
		sb.append(sequencia[i] + " ");
	}

	System.out.print(sb.toString().trim() + "\n");
	}

}
