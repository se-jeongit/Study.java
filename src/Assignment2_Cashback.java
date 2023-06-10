import java.util.Scanner;

public class Assignment2_Cashback {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[캐시백 계산]");
		System.out.printf("결제 금액을 입력해주세요.(금액):");
		int price = sc.nextInt();
		sc.close();

		// 결제 금액의 10% 계산 로직
		int cashback = (int) ((double) price * 0.1);

		// 만약 결제 금액의 10%가 300원 초과일 경우엔 300원으로 고정
		if (cashback >= 300) {
			cashback = 300;
		} else {
			// 100원 단위 캐시백이므로 10원 이하 단위 절삭
			cashback = (cashback / 100) * 100;
		}
		System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", price, cashback);
	}
}
