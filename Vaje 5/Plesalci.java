
import java.util.Scanner;

public class Plesalci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
		int stM = sc.nextInt();
		int stZ = sc.nextInt();
		int g = sc.nextInt();
		int counter = 1;
	
		for(int i = g; i <= stM; i+=g){
			for(int j = g; j <= stZ; j+=g){
				if(gcd(i,j) == g){
					System.out.printf("[%d] %d + %d\n",counter, i,j);
					counter++;
				}
			}
		}
	
	}

    /*
     * Vrne GCD pozitivnih celih stevil a in b.
     */
    public static int gcd(int a, int b) {
        while (b > 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }
}
