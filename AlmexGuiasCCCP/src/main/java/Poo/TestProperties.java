package Poo;

import comun.LeerProperties;

public class TestProperties {

	public static void main(String[] args) {
	
		LeerProperties prop = new LeerProperties();
		prop.getSystemProperties();
		String mensaje = System.getProperty("MENSAJE");
		
		
		
		System.out.println(mensaje);
		
		

	}

}