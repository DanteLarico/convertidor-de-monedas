package PER.challenge.conversor;

public class Monedas {

	//Valores de las monedas (basado en PER (SOLES))
	private double valorDolar = 3.72;
	private double valorDolarCanadiense = 3.72;
	private double valorFrancoSuizo = 4.16;
	private double valorEuro = 4.06;
	private double valorLibraEsterlina = 4.82;
	private double valorYen = 0.023;
	private double valorWonSurCoreano = 0.0027;
	
	//Clases para hacer la conversion de PER (SOLES) a otra moneda
	public void DollarToPer (double cantidad) {
		double totalPer = cantidad * valorDolar;
		System.out.println("Tienes S/." + totalPer + " SOLES " );
	}
	
	public void DollarCanadienseToPer(double cantidad) {
		double totalPer = cantidad * valorDolarCanadiense;
		System.out.println("Tienes S/." + totalPer + " SOLES ");
	}
	
	public void FrancoSuizoToPer(double cantidad) {
		double totalPer = cantidad * valorFrancoSuizo;
		System.out.println("Tienes S/." + totalPer + " SOLES ");
	}
	
	public void EuroToPer(double cantidad) {
		double totalPer = cantidad * valorEuro;
		System.out.println("Tienes S/." + totalPer + " SOLES ");
	}
	
	public void libraEsterlinaToPer(double cantidad) {
		double totalPer = cantidad * valorLibraEsterlina;
		System.out.println("Tienes S/." + totalPer + " SOLES ");
	}
	
	public void yenToPer(double cantidad) {
		double totalPer = cantidad * valorYen;
		System.out.println("Tienes S/." + totalPer + " SOLES ");
	}
	
	public void wonToPer(double cantidad) {
		double totalPer = cantidad * valorWonSurCoreano;
		System.out.println("Tienes S/." + totalPer + " SOLES4 ");
	}
	
}
