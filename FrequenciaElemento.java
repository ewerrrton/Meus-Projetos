import java.util.Scanner;

public class FrequenciaElemento{
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	int freq = 0;
	int number = sc.nextInt();
	sc.nextLine();
	String[] numbers = sc.nextLine().split(" ");


	for(String n : numbers) {
		if(n.equals(number + "")){
			freq++;
		}
	}

	System.out.println(freq);


	}





	
}
