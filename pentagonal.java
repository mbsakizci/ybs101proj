
public class pentagonal {

	public static int hesap(int sayi){
		int hesap;
		hesap = (sayi * ((3*sayi)- 1)/2);
		return hesap;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nextline = 0;
		int totalcount = 100;
		int kolcount = 10;
		for (int i = 1; i <= totalcount; i++)
		{
			System.out.print(hesap(i) + " \t ");
			kolcount++;
			if (kolcount % 10 == 0)
			{
				System.out.println();
				
			}
		}
		
	}

}
