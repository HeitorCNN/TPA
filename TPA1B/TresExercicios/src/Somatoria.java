import java.util.Scanner;

public class Somatoria {
	
	public static void main(String[] args) {
		
	
		int R = 0;
		System.out.println("M�ltiplos: ");
		for (int i = 0;i <= 400; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
				R += i;
				
				if (i != 4) {
					 System.out.println("Valor atual da somat�ria: " + R);
				};
				  
			};
		}
		System.out.println("Valor final da somat�ria: " + R);
		
		
		
	}
}
