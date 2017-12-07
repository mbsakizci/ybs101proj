import java.util.Scanner;

public class faizhesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yatýrýmmiktarý,aylýkfaiz;
		Scanner input = new Scanner (System.in);
		System.out.println("kaç para yatýrým yapmak istiyosun ");
		yatýrýmmiktarý = input.nextDouble();
		System.out.print(" faiz oranýn ne olsun ");
		aylýkfaiz = input.nextDouble();
		System.out.println("kar 1.sene" +  futureInvestmentValue (yatýrýmmiktarý,aylýkfaiz ,1));

		for (int sene = 1; sene <= 30; sene++);
		System.out.println("kar sene" + sene + "=" + (int)futureInvestmentValue);
	}
   public static double futureInvestmentValue ( double yatýrýmmiktarý , double aylýkfaiz , int sene) {
	   
   
	double kaçparakazanýcam;
   kaçparakazanýcam = yatýrýmmiktarý *Math.pow ((1 + aylýkfaiz/1200),(sene*12));
   return kaçparakazanýcam;
	
   }
	
}
