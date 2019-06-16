import java.util.Scanner;

class Romanje1{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int dolzinaPoti = sc.nextInt();
		int prehojenaPot = sc.nextInt();
		
		while(dolzinaPoti > 0){
			System.out.println(dolzinaPoti);
			dolzinaPoti = dolzinaPoti - prehojenaPot;
		}
	
	}
} 