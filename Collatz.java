import java.util.Scanner;

class Collatz{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int cifra = sc.nextInt();
		int counter = 1;
		
		while(cifra > 1){
			
			if(cifra % 2 == 0){
				cifra = cifra / 2;
			}
			else{
				cifra = (cifra * 3) + 1;
			}
			counter++;
		}
		
		System.out.println(counter);
	}
}