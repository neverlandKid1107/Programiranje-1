
import java.util.Scanner;

public class Smreka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int stPiramid = sc.nextInt();
		
		
		for (int i = 1;  i <= stPiramid;  i++) {
			
			malTja(i, stPiramid - i);
		}
    }


    private static void malTja(int velikost, int zamik) {
		for (int i = 1;  i <= velikost;  i++) {
			
			znaki(zamik, ' ');  
			
			
			znaki(velikost - i, ' ');
			
		
			znaki(2 * i - 1, '*');
			
			System.out.println();
		}
    }
	
	
	private static void znaki(int stZnakov, char znak) {
		for (int i = 1;  i <= stZnakov;  i++) {
			System.out.print(znak);
		}
	}
}