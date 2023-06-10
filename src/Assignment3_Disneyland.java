import java.util.Scanner;

public class Assignment3_Disneyland {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 기본 입장료 세팅
		int result = 10000;

		System.out.println("[입장권 계산]");
		System.out.printf("나이를 입력해 주세요.(숫자):");
		int age = sc.nextInt();
		System.out.printf("입장시간을 입력해 주세요.(숫자입력):");
		int admissionTime = sc.nextInt();
		System.out.printf("국가유공자 여부를 입력해 주세요.(y/n):");
		String nationalMerit = sc.next();
		System.out.printf("복지카드 여부를 입력해 주세요.(y/n):");
		String welfareCard = sc.next();

		sc.close();

		// 3세 미만일 경우 입장료 0원
		if (age < 3) {
			result = 0;
		}
		// 13세 미만일 경우 입장료 4천원
		else if (age < 13) {
			result = 4000;
		}
		// 입장 시간이 17시 이후일 경우 입장료 4천원
		else if (admissionTime >= 17) {
			result = 4000;
		}
		// 국가유공자거나 복지카드가 있을 경우 입장료 8천원
		else if (nationalMerit.equals("y") || welfareCard.equals("y")) {
			result = 8000;
		}
		System.out.printf("입장료: %d", result);
	}
}