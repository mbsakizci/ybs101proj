import java.util.Scanner;

public class diziornek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int boyut = 5;
		Scanner input = new Scanner (System.in);
		int[] dizi2 = new int[boyut];
		for (int i =0; i<dizi2.length; i++) {
			dizi2[i] = (int)(Math.random()*dizi2.length);
		}
		// dizinin icini okumak icin 
				for (int i = 0; i<dizi2.length; i++) {
					System.out.print((i+1) + " = " + dizi2[i] + " , ");
					
		}
		System.out.println("____________________");
		// dizinin sol a dogru ittir
		int temp = dizi2[0];
		for (int i=0; i<dizi2.length-1; i++) {
			dizi2[i] = dizi2[i+1];
		}
		System.out.println("sola ittirmeden sonra__________________________");
		
				/*
	    // dizinin icindekileri topla
		int toplam = 0;
		for (int i=0; i< dizi2.length; i++) {
			toplam = toplam + dizi2[i];		
		}
		System.out.println("toplam = " + toplam);
		// min u bul 
		int min = dizi2[0];
		for (int i =1; i< dizi2.length; i++) {
			if (dizi2[i] < min) {
				min = dizi2[i];
			}
		}
		
		System.out.println("min = " + min);
		/*
		int boyut2;
		System.out.println("kac sayi gireceksiniz");
		boyut2 = input.nextInt();
		
		int [] dizi1 = new int [boyut2];
		// dizinin icini doldur
		for (int i = 0; i<boyut2; i++ ){
			System.out.println(i + "int degerini giriniz");
			dizi1[i]= input.nextInt();		
		}
		// dizinin icini okumak icin 
		for (int i = 0; i<boyut2; i++) {
			System.out.print(i+1 + " = " + dizi1[i] + " , ");
			
		}
		*/
		
		
		
	}

}
