import java.util.Scanner;

public class faizhesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yat�r�mmiktar�,ayl�kfaiz;
		Scanner input = new Scanner (System.in);
		System.out.println("ka� para yat�r�m yapmak istiyosun ");
		yat�r�mmiktar� = input.nextDouble();
		System.out.print(" faiz oran�n ne olsun ");
		ayl�kfaiz = input.nextDouble();
		System.out.println("kar 1.sene" +  futureInvestmentValue (yat�r�mmiktar�,ayl�kfaiz ,1));

		for (int sene = 1; sene <= 30; sene++);
		System.out.println("kar sene" + sene + "=" + (int)futureInvestmentValue);
	}
   public static double futureInvestmentValue ( double yat�r�mmiktar� , double ayl�kfaiz , int sene) {
	   
   
	double ka�parakazan�cam;
   ka�parakazan�cam = yat�r�mmiktar� *Math.pow ((1 + ayl�kfaiz/1200),(sene*12));
   return ka�parakazan�cam;
	
   }
	
}
