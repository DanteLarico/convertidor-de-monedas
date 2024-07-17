package PER.challenge.tests;

import java.util.Scanner;

import PER.challenge.conversor.Monedas;

public class TestConversor {

	public static void main(String[] args) {
		
		//objeto para llamar a los metodos de conversion PER (SOLES)a otras monedas
		Monedas conversorPer = new Monedas();
		
		Scanner entradaOpcion = new Scanner(System.in); //para crear un objeto scanner de las opcinoes
		Scanner entradaCantidad = new Scanner(System.in); //para la cantidad de dinero
		
		System.out.println("========== CONVERSOR DE MONEDAS ===========");
		System.out.println("Por favor, elige alguna de las siguientes opciones para \n"
							+ "--- 1) Convertir Dolares a PER \n"
							+ "--- 2) Convertor Dolar Canadiense a PER \n"
							+ "--- 3) Convertor Franco Suizo a PER \n"
							+ "--- 4) Convertor Euros a PER \n"
							+ "--- 5) Convertir Libra Esterlina a PER \n"
							+ "--- 6) Convertir Yen a PER \n"
							+ "--- 7) Convertir Won surcoreano a PER \n"
							+ "\n----- Para terminar el programa ingresa una Q !!!!");
		
		int opcion = entradaOpcion.nextInt(); //para que el programa lea la opcion
		System.out.println("\nIngresa la cantidad que quieres convertir: ");
		double cantidadDinero = entradaCantidad.nextDouble(); //cantidad dinero
		
		switch (opcion) {
		case 1:
			System.out.println("Convirtiendo Dolares a PER...");
			conversorPer.DollarToPer(cantidadDinero);
			break;
		case 2:
			System.out.println("Convirtiendo Dolares Canadienses a PER...");
			conversorPer.DollarCanadienseToPer(cantidadDinero);
			break;
		case 3:
			System.out.println("Convirtiendo Franco Suizo a PER...");
			conversorPer.FrancoSuizoToPer(cantidadDinero);
			break;
		case 4:
			System.out.println("Convirtiendo Euro a PER...");
			conversorPer.EuroToPer(cantidadDinero);
			break;
		case 5:
			System.out.println("Convirtiendo Libra Esterlina a PER...");
			conversorPer.libraEsterlinaToPer(cantidadDinero);
			break;


		case 6:
			System.out.println("Convirtiendo Yen a PER...");
			conversorPer.yenToPer(cantidadDinero);
			break;
		case 7:
			System.out.println("Convirtiendo Won a PER...");
			conversorPer.wonToPer(cantidadDinero);
			break;
			
		default:
			System.out.println("La opcion no es valida");
			break;
		}
	}
}
