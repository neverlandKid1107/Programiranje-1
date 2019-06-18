import java.util.Scanner;

class DN01{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int stPeriod = sc.nextInt();
		int valovnaDolzina = sc.nextInt();
		int amplituda = sc.nextInt();
		int fazniZamik = sc.nextInt();
		
		int ponovitve = 0;
		int MinDolzina = valovnaDolzina/2;
	
		if(fazniZamik == 0){
			
			for(int a = 0; a < stPeriod; a++){
				
				for(int i = 1; i <= valovnaDolzina/2; i++){
					if(i == valovnaDolzina/2){
						System.out.print("+");
					}
					else{
						System.out.print("-");
					}
				}
			
				for(int i = 1; i <= valovnaDolzina/2; i++){
					if(i == valovnaDolzina/2){
						System.out.print("+");
					}
					else{
						//System.out.print("*");
						System.out.print(" ");
					}
				}
			}
		
			System.out.println();
			ponovitve = 2 * stPeriod;
		
			for(int a = 1; a <= amplituda - 1; a++){
				for(int b = 0; b < ponovitve; b++){
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i == valovnaDolzina/2){
							System.out.print("|");
						}
						/*else if( i == valovnaDolzina/2 && a == amplituda){
							System.out.print("+");
						}*/
						else{
						System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
			
			for(int a = 0; a < ponovitve/2; a++){
				for(int i = 1; i <= valovnaDolzina/2; i++){
					if(i == valovnaDolzina/2){
						System.out.print("+");
					}
					else{
						System.out.print(" ");
					}
				}
				
				for(int i = 1; i <= valovnaDolzina/2; i++){
					if(i == valovnaDolzina/2){
						System.out.print("+");
					}
					else{
						System.out.print("-");
					}
				}
			}
		
		}
		else if(MinDolzina > fazniZamik){
			int zacetek = valovnaDolzina/2 - fazniZamik;
			
			for(int a = 1; a <= stPeriod; a++){
				if(a == 1){
					for(int i = 1; i <= zacetek; i++){
						if(i == zacetek){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
					
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i== valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
				}
				else{
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i== valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
					
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i== valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
				}
			}
			
			for(int i = 0; i < fazniZamik; i++){
				System.out.print("-");
			}
			System.out.println();
			for(int a = 1; a <=  amplituda - 1; a++){
				for(int b = 1; b <= stPeriod*2; b++){
					if(b == 1){
						for(int i = 1; i <= zacetek; i++){
							if(i == zacetek){
								System.out.print("|");
							}
							else{
								System.out.print(" ");
							}
						}
					}
					else if(b != 1 && b != stPeriod*2){
						for(int i = 1; i <= valovnaDolzina/2; i++){
							if(i == valovnaDolzina/2){
								System.out.print("|");
							}
							else{
								System.out.print(" ");
							}
						}
					}
					else{
						for(int i = 1; i <= valovnaDolzina/2; i++){
							if(i == valovnaDolzina/2){
								System.out.print("|");
							}
							else{
								System.out.print(" ");
							}
						}
						
						for(int i = 0; i < fazniZamik; i++){
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
			
			
			for(int a = 1; a <= stPeriod; a++){
				if(a == 1){
					for(int i = 1; i <= zacetek; i++){
						if(i == zacetek){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
					
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i== valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
				}
				else{
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i== valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
					
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i== valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
				}
			}
			
			for(int i = 0; i < fazniZamik; i++){
				System.out.print(" ");
			}
			
			
			
		}
		else{
			int start = fazniZamik - valovnaDolzina/2;
			int ostanek = valovnaDolzina/2 - start;
			
			for(int a = 0; a < stPeriod;a++){
				if(a == 0){
					for(int i = 1; i <= ostanek; i++){
						if(i == ostanek){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
					
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i == valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
				}
				else{
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i == valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i == valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
				}
				
			}
			for(int i = 0; i < start; i++){
					System.out.print(" ");
			}
			System.out.println();
			
			for(int a = 0; a < amplituda - 1; a++){
				for(int b = 1; b <= stPeriod*2; b++){
					if(b==1){
						for(int i = 1; i <= ostanek; i++){
							if(i == ostanek){
								System.out.print("|");
							}
							else{
								System.out.print(" ");
							}
						}
					}
					else{
						for(int i = 1; i <= valovnaDolzina/2; i++){
							if(i == valovnaDolzina/2){
								System.out.print("|");
							}
							else{
								System.out.print(" ");
							}
						}
					}
				}
				for(int i = 0; i < start; i++){
					System.out.print(" ");
				}
				
				System.out.println();
			}
			
			for(int a = 0; a < stPeriod;a++){
				if(a == 0){
					for(int i = 1; i <= ostanek; i++){
						if(i == ostanek){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
					
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i == valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
				}
				else{
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i == valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print("-");
						}
					}
					for(int i = 1; i <= valovnaDolzina/2; i++){
						if(i == valovnaDolzina/2){
							System.out.print("+");
						}
						else{
							System.out.print(" ");
						}
					}
				}		
			}
			for(int i = 0; i < start; i++){
				System.out.print("-");
			}
		}
	}
}