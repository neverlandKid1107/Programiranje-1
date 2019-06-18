import java.util.Scanner;
import java.util.Random;

public class Dvoboj{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int seed = sc.nextInt();
		int kokStWin = sc.nextInt();
		int anja = sc.nextInt();
		int bojan = sc.nextInt();
		Random generator = new Random(seed);
		int winAnja = 0;   
		int winBojan = 0;  
		
		while (winAnja < kokStWin && winBojan < kokStWin) {
		
			int rezultat = igra(generator, anja, bojan);
			
			switch (rezultat) {
				case 1:
					System.out.print("A");
					winAnja++;
					break;
					
				case 2:
					System.out.print("B");
					winBojan++;
					break;
				
				case 0:  
					System.out.print("-");
				 
			}
		}
		System.out.println();
    }
	
	
	private static int igra(Random generator, int anja, int bojan) {
		
		int neki = generator.nextInt(100);
		if (neki < anja) {
			
			return 1;
		}
		if (neki < anja + bojan) {
		
			return 2;
		}
		
		return 0;
	}
}
