import java.util.Scanner;

class DN01{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int counter = 0;
		int stKvadratka = 0;
		
		int noviA = a-1;
		int noviB = b-1;
		
		
		if( a < b){
			
			while(noviA > 0){
				
				stKvadratka = noviA * noviB;
				
				noviA = noviA - 1;
				noviB = noviB - 1;
				
				counter = counter + stKvadratka;
			}
			
			System.out.println(counter);
		}
		else{
			
			while(noviB > 0){
				
				stKvadratka = noviA * noviB;
				
				noviA = noviA - 1;
				noviB = noviB - 1;
				
				counter = counter + stKvadratka;
			}
			
			System.out.println(counter);
		}
	}
}