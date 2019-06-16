import java.util.Scanner;

class Collatz2{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int spMeja = sc.nextInt();
		int zgMeja = sc.nextInt();
		int counter = 1;
		
		int najZaporedje = 0;
		int cifra = 0;
		int clen = 0;
		
		for(int i = spMeja; i <= zgMeja; i++){
			clen = i;
			counter = 1;
			while(clen > 1){

				if(clen % 2 == 0){
					clen = clen / 2;
				}
				else{
					clen = (clen * 3) + 1;
				}
				counter++;
			}
		
			if(najZaporedje < counter){
				najZaporedje = counter;
				cifra = i;
			}
		}
		
		System.out.println(cifra);
		System.out.println(najZaporedje);
		
	}
}