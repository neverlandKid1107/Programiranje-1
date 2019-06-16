import java.util.Scanner;

class Romanje2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int dolzinaPoti = sc.nextInt();
		int prehojenaPot = sc.nextInt();
		int ostanekPoti = 0;
		int dan = 1;
		
		while(dolzinaPoti > 0){
			ostanekPoti = dolzinaPoti - prehojenaPot;
			
			
			if(ostanekPoti < 0){
				prehojenaPot = dolzinaPoti;
				System.out.println(dan+". dan: "+dolzinaPoti+" -> 0 (prehodil "+prehojenaPot+")");
			}
			else{
				System.out.println(dan+". dan: "+dolzinaPoti+" -> "+ostanekPoti+" (prehodil "+prehojenaPot+")");
			}
			
			dolzinaPoti = dolzinaPoti - prehojenaPot;
			dan++;
		}
	}
} 