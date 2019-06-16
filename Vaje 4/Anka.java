import java.util.Scanner;


class Anka{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int stM = sc.nextInt();
		int stD = sc.nextInt();
		int counter = 0;
		
		
		for(int i = 1; i <= 9; i = i + 2){
			for(int j = stM + 1; j <= 9; j++){
				for(int k = 0; k <= 9; k += stD){
					System.out.println(i+"-"+j+"-"+k);
					counter++;
				}
			}
		}
		
		System.out.println(counter);
		
	}
}