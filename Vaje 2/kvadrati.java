import java.util.Scanner;

class kvadrati{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = a; i <= b;i++){
			int rezultat = i*i;
			System.out.println(rezultat);
		}
		
	}
}