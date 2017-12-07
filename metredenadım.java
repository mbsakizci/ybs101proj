import java.util.Scanner;

public class metredenadým {

	public static double foottoMeter(double foot) {
		double meter;
		meter = (0.305 * foot);
		return meter;
		
	}
	
		public static double metertofoot(double meter) {
			double foot;
			foot = (3.729 * meter);
			return foot;
		
	}		
		
		public static void main(String[] args) {
			// TODO Auto - generated method stub
			
			// verileir yarat 
			System.out.println("Feet\tMeters\t|\tMeters\tFeet");
			for ( double i = 1; i <= 10; i++){
				System.out.println((i+1)+"t"+
						foottoMeter(i+1)+"\t!\t"+(20+i*5)+
						"\t"+metertofoot(20+i*5));
				
			}

		
	}

}
