import java.util.Scanner;

public class SecondoEsercizio {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double km;
		double litri;
		double kmPerLitro;

		while (true) {
			try {
				System.out.println("Inserisci il numero di km percorsi:");
				km = scanner.nextDouble();
				System.out.println("Inserisci il numero di litri consumati:");
				litri = scanner.nextDouble();
				if (litri == 0) {
					throw new ArithmeticException("Divisione per zero!");
				}
				kmPerLitro = km / litri;
				System.out.println("Km/litro percorsi: " + kmPerLitro);
			} catch (Exception e) {
				System.out.println("Errore: " + e.getMessage());
			}
			System.out.println("Vuoi continuare? (s/n)");
			String risposta = scanner.next();
			if (risposta.equals("n")) {
				System.out.println("chiusura dell'applicazione...");
				break;
			}
		}
		scanner.close();
	}
}
