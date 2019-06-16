import java.util.Scanner;

class Zgoscenke{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int stZgoscenk = sc.nextInt();
		int kapaciteta = sc.nextInt();
		int counter = 1;
		int trenutnaKapaciteta = 0;
		
		while(sc.hasNextInt()){
			
			int podatki = sc.nextInt();
			
			trenutnaKapaciteta = trenutnaKapaciteta + podatki;
			
			if(trenutnaKapaciteta > kapaciteta){
				trenutnaKapaciteta = podatki;
				counter++;
				if(counter <= stZgoscenk){
					System.out.println(podatki+" EP -> zgoscenka "+counter+" ("+podatki+" EP)");	
				}
				
				
			}
			else if(counter <= stZgoscenk){
				System.out.println(podatki+" EP -> zgoscenka "+counter+" ("+trenutnaKapaciteta+" EP)");
			}	
		}
	}
}
