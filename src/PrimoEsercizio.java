import java.util.Scanner;

public class PrimoEsercizio {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Scanner scanner = new Scanner(System.in);
		int num;
		int pos;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 2;
		}

		while (true) {
			System.out.println("Array attuale:");
			for (int i = 1; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println("\nInserisci un numero (0 per uscire):");
			num = scanner.nextInt();
			if (num == 0) {
				break;
			}
			System.out.println("Inserisci la posizione da 1 a 5:");
			pos = scanner.nextInt();
			if (pos < 0 || pos >= arr.length) {
				System.out.println("Posizione non valida!");
				continue;
			}
			arr[pos] = num;
		}
		scanner.close();
	}

}