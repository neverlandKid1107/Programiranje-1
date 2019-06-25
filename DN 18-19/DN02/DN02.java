import java.util.Scanner;

class DN02{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int komanda = sc.nextInt();
		int zadnjiElement = 0;
		int vsota = 0;
		int dolzinaCete = 0;
		int dolzinaMax = 0;
		int stRazlicnih = 0;
		int najRazlicnih = 0;
		
		
		loop: while(sc.hasNextInt()){
			
			int element = sc.nextInt();
			vsota = 0;
			
			switch(komanda){
				
				case 1:
					System.out.println(element);
					break loop;
				case 2:
					zadnjiElement = element;
					break;
					
				case 3:
					vsota = element + zadnjiElement;
					zadnjiElement = element;
					break;
				case 4:
				
					if(element >= zadnjiElement){
						dolzinaCete++;
						zadnjiElement = element;
					}
					else{
						break loop;
					}
					break;
				case 5:
					if(element > zadnjiElement){
							stRazlicnih++;
					}
					else if(element == zadnjiElement){
					
					}
					else{
						stRazlicnih=0;
						stRazlicnih++;
					}	
		
					if(najRazlicnih < stRazlicnih){
						najRazlicnih = stRazlicnih;
					}
					
					zadnjiElement= element;
					
					break;
				
			}
		}
		
		if(komanda == 2){
			System.out.println(zadnjiElement);
		}
		else if(komanda == 3){
			System.out.println(vsota);
		}
		else if(komanda == 4){
			System.out.println(dolzinaCete);
		}
		else if( komanda == 5){
			System.out.println(najRazlicnih);
		}
		
	}
}