package hipotenusa;

import java.util.Scanner;

public class hipotenusa01 {

	public static void main(String[] args) {
		double cateto1,cateto2;
		try (Scanner sc = new Scanner  (System.in)) {
			System.out.println("introduce el valor del cateto1:");
			cateto1=sc.nextDouble();
			System.out.println("introduce el valor del cateto2:");
			cateto2=sc.nextDouble();
		}
		System.out.println("lahipotenusa es:"+Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2,2 )));
	}

}
