import java.util.Scanner;

class DN00{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int stBonbonov = sc.nextInt();
		int stPrijateljev = sc.nextInt();
		
		int stRazdeljenih = stBonbonov / stPrijateljev;
		int ostanek = stBonbonov - (stPrijateljev * stRazdeljenih);
	
		System.out.println(stRazdeljenih);
		System.out.println(ostanek);
	
	}
}