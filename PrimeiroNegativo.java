import java.util.Scanner;


public class PrimeiroNegativo {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	boolean encontrado = false;
	int negativo = 0;
	String numbers[] = sc.nextLine().split(" ");
	for(String i : numbers) {
		if( Integer.parseInt(i) < 0) {
		encontrado = true;
		negativo = Integer.parseInt(i);
		break;
		}
	}

	if(encontrado) {
		System.out.println(negativo);
	}else {
		System.out.println("-");
	}


	
	
	}

}

