import java.util.Scanner;

public class metodlar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double alan2 = ucgenalanhesapla (8.95 , 8.0 , 9.72);
		System.out.println("1,1,1 ucgen alaný = " + alan2 );
		double alan1 = ucgenalanhesapla (1,1,1);
		Scanner input = new Scanner (System.in);
		double i1,i2,i3 ;
		System.out.println("1.KENARI GÝR");
		i1 = input.nextDouble();
		System.out.println("2.KENARI GÝR");
		i2 = input.nextDouble();
		System.out.println("3.KENARI GÝR");
		i3 = input.nextDouble();
		double alan3 = ucgenalanhesapla(i1,i2,i3);
		System.out.println("3.ucgenalaný = "+ alan3 );
	}
	public static double ucgenalanhesapla(double k1, double k2 , double k3) {  
    double s = (k1 +k2 + k3)/2;
	double alan;
	alan = Math.pow( (s  *(s-k1) * (s-k2) * (s-k3) ) , 0.5);
	ucgenalanbas(alan, k1 , k2 ,k3);
	return alan;
   }
	public static void ucgenalanbas(double alan,double k1 ,double k2, double k3){
		System.out.println("ucgenin alaný " + k1 + " " + k2 + " " + k3 +" ");

	
	}}
