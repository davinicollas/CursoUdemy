package udemy;

import java.util.Locale;
import java.util.Scanner;

/*public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x =4;
		int y = 0;
		int i =0;
		while(i<x) {
			i = i+1;
			y = y+i;
			System.out.println(i);
			System.out.println(y);

		}
		
		sc.close();
		
	}

}
*/
/*
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int senha , i =0;
		System.out.println("Informe a senha");
		senha = sc.nextInt();
		while(senha != 2002) {
			System.out.println("senha incorreta");
			senha = sc.nextInt();

		}
		System.out.println("senha correta");
		
		sc.close();
	}
	}
*/
/*
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x ,y;
		System.out.println("Informe x");
		x = sc.nextInt();
		System.out.println("Informe y");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		
			
			
			
			
		}
		
		sc.close();
	}
	}
*/
/*public class Main {

public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int x, alcool =0 , gasolina = 0, diesel = 0;
	
	System.out.println("Informe o combustivel");
	x = sc.nextInt();
	while (x != 4) {
		if (x == 1) {
			alcool ++;
		}
		else if (x== 2) {
			gasolina ++;
		}
		else if (x == 3) {
			diesel ++;
		}
		else {
			System.out.println("Informe outro Numero valido  ");
		}
		x = sc.nextInt();
		}
		System.out.println("Muito obrigado");
		System.out.println("Alcool: " + alcool);
		System.out.println("gasolina: " +gasolina);
		System.out.println("Diesel: " +diesel);
		
	sc.close();
}

}
*/
public class Main {

public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	int x,i;
	x = sc.nextInt();
		for(i = 0; i<x ; i++) {
			if(x % 2 == 1) {
				System.out.println(x);
			}	
		}
	sc.close();
}
}
