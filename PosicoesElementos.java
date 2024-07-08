import java.util.Scanner;

public class PosicoesElementos {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	boolean Encontrado = false;
	int number = sc.nextInt();
	
	sc.nextLine();	
	String[] numbers = sc.nextLine().split(" ");
	
	StringBuilder sb = new StringBuilder();

	for(int i = 0; i < numbers.length; i++) {
		if(numbers[i].equals(number + "")) {
			Encontrado = true;

			if(sb.length() > 0) {
				sb.append(" ");
			}

			sb.append(i);
		}
	}

	if(Encontrado) {
		System.out.println(sb.toString());

	}else {
		System.out.println(-1);
	}

	}
}
