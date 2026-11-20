package com.krakedevTallerCalculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora c1 = new Calculadora();
		
		double r1;
		
		r1 = c1.sumar(10, 35);
		
		System.out.println("Reusltado suma:" + r1);
		
		int r2;
		
		r2 = c1.restar(10, 6);
		System.out.println("Reusltado resta:" + r2);
		
		double r3;
		
		r3 = c1.multiplicar(5, 10);
		System.out.println("Resultado multiplicar: "+ r3);
		
		double r4;
		
		r4 = c1.dividir(20, 5);
		System.out.println("Resultado dividir: " + r4);
		
		double r5;
		r5 = c1.promediar(10, 8, 9);
		System.out.println("Resultado promediar: " + r5);
			 
		
	}

}
