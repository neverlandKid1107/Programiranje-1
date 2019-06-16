import java.util.Scanner;

class Piramida{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int stVrstic = sc.nextInt();
		int presledek = stVrstic - 1;
		int stZvezdic = 1;
		
		for(int i = 0; i < stVrstic; i++){
			
			for(int j = 0; j < presledek; j++){
				System.out.print(" ");
			}
			for(int j = 0; j < stZvezdic; j++){
				System.out.print("*");
			}
			
			System.out.println();
			presledek--;
			stZvezdic += 2;
		}
	}
}