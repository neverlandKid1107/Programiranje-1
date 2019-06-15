import java.util.Scanner;


class steviloStevk{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int stevilo = sc.nextInt();
		int counter = 0;
		
		while(stevilo > 0){
			stevilo = stevilo / 10;
			counter++;
		}
		System.out.println(counter);
	}
}