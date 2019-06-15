import java.util.Scanner;


class izpisStevk{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long stevilo = sc.nextLong();
		
		while(stevilo > 0){
			long stevka = stevilo % 10;
			
			System.out.println(stevka);
			stevilo = stevilo / 10;
		}
		
	}
}