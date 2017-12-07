import java.util.Scanner;
public class hafta9ebob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		int sayi1, sayi2;
		sayi1 = input.nextInt();
		sayi2 = input.nextInt();
		int ebob = ebob(sayi1, sayi2);
		System.out.println("ortak bolen " + ebob);
		ebobbas(sayi1, sayi2);
		
		
	}

	public static int ebob(int sayi1, int sayi2) {
		int lebob = 1; 
		int k = 1;
		while (k <= sayi1 && k <= sayi2 ) { 
			if (sayi1 %k == 0 && sayi2 %k == 0) {
				lebob = k;
			}
			k++;
		}
		return lebob;
		
	}
	
	public static void ebobbas(int sayi1, int sayi2) {
		int lebob = 1; 
		int k = 1;
		while (k <= sayi1 && k <= sayi2 ) { 
			if (sayi1 %k == 0 && sayi2 %k == 0) {
				lebob = k;
			}
			k++;
		}
		System.out.println("ortak bolen " + lebob);
	}
}
