package funcoes_matematicas;

public class Main {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C; 
		
		double d = 2.0;
		double e = 9.0;
		double f = 7.0;
		double delta, x1, x2;
		
		//Raiz quadada
		A = Math.sqrt(x); 
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		//Potencia x elevado a y
		A = Math.pow(x, y); 
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		//Valor Absoluto
		A = Math.abs(y); 
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B); 
		
		//Calculo de Barcara
		delta = Math.pow(e, 2.0) - 4*d*f;
		x1 = (-e + Math.sqrt(delta)) / (2.0 * d);
		x2 = (-e - Math.sqrt(delta)) / (2.0 * d);
		System.out.println("Valor de DELTA: " + delta);
		System.out.println("Valor do calculo de Báscara: X1 = " + x1 + "   X2 = " + x2); 

	}

}
