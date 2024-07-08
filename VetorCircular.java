import java.util.Scanner;

public class VetorCircular {
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	

	
	String[] valores = sc.nextLine().split(" ");

	int voltas = sc.nextInt();
	int contador = 0;	

	StringBuilder sb = new StringBuilder();
	

	for(int i = 0; contador < voltas; i++) {
		sb.append(valores[i % valores.length]).append(" ");
		contador++;
	}

	System.out.println(sb.toString().trim());

	}
	
}


