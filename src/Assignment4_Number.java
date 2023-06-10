import java.util.Random;
import java.util.Scanner;

public class Assignment4_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("[주민등록번호 계산]");
		System.out.printf("출생년도를 입력해 주세요.(yyyy):");
		int yearOfBirth = sc.nextInt();
		System.out.printf("출생월을 입력해 주세요.(mm):");
		int monthOfBirth = sc.nextInt();
		System.out.printf("출생일을 입력해 주세요.(dd):");
		int dateOfBirth = sc.nextInt();
		System.out.printf("성별을 입력해 주세요.(m/f):");
		String gender = sc.next();

		sc.close();

		StringBuilder sb = new StringBuilder();

		// 입력받은 출생년도에서 앞 2자리 절삭하여 StringBuilder에 append.
		sb.append(Integer.toString(yearOfBirth).substring(2, 4));

		// 입력받은 출생월 StringBuilder에 append.
		sb.append(Integer.toString(monthOfBirth));

		// 입력받은 출생일이 10 미만이면
		if (dateOfBirth < 10) {
			// 앞에 0을 붙이고 StringBuilder에 append.
			sb.append("0");
			sb.append(Integer.toString(dateOfBirth));
		} else {
			// 그렇지 않으면 앞에 0을 붙이지 않고 StringBuilder에 append.
			sb.append(Integer.toString(dateOfBirth));
		}

		sb.append("-");

		// 2020년도 이후 출생한 사람에 대한 주민등록번호 생성이므로 성별에 따른 주민등록 번호는 남자일 경우 3, 여자일 경우 4로 StringBuilder에 append.
		if (gender.equals("m")) {
			sb.append(3);
		} else {
			sb.append(4);
		}

		// 성별 주민등록번호 이후의 나머지 자리는 랜덤 생성하여 StringBuilder에 append.
		while (sb.length() < 14) {
			sb.append(rd.nextInt(999999) + 1);
		}
		
		// 주민등록번호의 마지막 자리에 999999와 같은 값이 생성되어 저장될 경우를 대비하여 주민등록번호 자릿수만큼(14자리) substring하여 리턴. 
		System.out.println(sb.substring(0, 14));
	}
}
