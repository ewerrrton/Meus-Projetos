import java.util.Scanner;

public class TrocaVizinhos {
	
	public static void main(String[]args) {
	
	Scanner sc = new Scanner(System.in);
	
	String[] numbers = sc.nextLine().split(" ");
	int indice = sc.nextInt();
	
	
	for(int i = 0; i < numbers.length; i++) {
		
		if(i == indice) {
			String atual = numbers[i];
			numbers[i] = numbers[i+1];
			numbers[i+1] = atual;		
		}
	}
	
	for(int i = 0; i < numbers.length; i++) {
		System.out.print(numbers[i]);
		if(i < numbers.length -1) {
			System.out.print(" ");
		}
	}	
	
	System.out.println();
	}

}
