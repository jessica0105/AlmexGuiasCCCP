package javabasics;

public class EnviarExcel {
	//constructor
	int numero1, numero2;
	
	public EnviarExcel (int numero1, int numero2) {
	this.numero1=numero1;
	this.numero2=numero2;
	
	}
	// metodo
	public void mensajeBienvenida() {
		System.out.println("Bienvenidos");
	}
	
	public int sumatoria() {
		return numero1+numero2;
		
	}
	public String mostrarNombre(String nombre) {
		System.out.println(nombre);
		return nombre;
	}



}
