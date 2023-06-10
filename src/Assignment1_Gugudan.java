
public class Assignment1_Gugudan {

	public static void main(String[] args) {
		System.out.println("[구구단 출력]");
		String str = "";

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j * i >= 10) {
					str = String.format("0%d x 0%d = %d", j, i, j * i);
					System.out.printf(str);
					if (j != 9) {
						System.out.printf("\t");
					}
				} else {
					str = String.format("0%d x 0%d = 0%d", j, i, j * i);
					System.out.printf(str);
					if (j != 9) {
						System.out.printf("\t");
					}
				}
			}
			System.out.println("");
		}
	}
}