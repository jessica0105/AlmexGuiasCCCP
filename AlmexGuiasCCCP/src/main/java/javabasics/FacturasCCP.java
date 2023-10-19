package javabasics;

import javax.swing.JOptionPane;

public class FacturasCCP {//open class
	//variables
	/*String miNombre = "Jessica Garcia";
	int edad = 32;
	// 
	float edadConDecimal = (float) 32.0;
	double edadDoble = 32.0000000000;
	char letra = 'N';
	boolean bandera = true;*/
		
	
	
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		
		double numero1 =500.0035;
		double numero2 = 35.37;
		double resultado =numero1+numero2;
		System.out.println("El resultado de la suma es: " + resultado);
		//mostrar mensaje en consola
		JOptionPane.showMessageDialog(null, numero1+numero2);
	}// end metodo main

}//end class
