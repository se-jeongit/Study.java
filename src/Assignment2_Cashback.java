import java.util.Scanner;

public class Assignment2_Cashback {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[캐시백 계산]");
		System.out.printf("결제 금액을 입력해주세요.(금액):");
		int price = sc.nextInt();
		sc.close();

		int cashback = (int) ((double) price * 0.1);

		if (cashback >= 300) {
			cashback = 300;
		} else {
			cashback = (cashback / 100) * 100;
		}
		System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", price, cashback);
	}
}
