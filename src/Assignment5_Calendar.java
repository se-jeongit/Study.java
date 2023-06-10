import java.util.Calendar;
import java.util.Scanner;

public class Assignment5_Calendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[달력 출력 프로그램]");
		System.out.printf("달력의 년도를 입력해 주세요.(yyyy):");
		int year = sc.nextInt();
		System.out.printf("달력의 월을 입력해 주세요.(mm):");
		int month = sc.nextInt();
		System.out.printf("\n\n");
		
		sc.close();
		
		Calendar cld = Calendar.getInstance();
		// 입력받은 년도와 월로 캘린더 세팅
		cld.set(year, month - 1, 1);
		
		// 해당 주의 첫 시작 날짜 세팅
		int startDay = cld.get(cld.DAY_OF_WEEK);
		// 해당 달의 마지막 날짜 세팅
		int lastDay = cld.getActualMaximum(cld.DAY_OF_MONTH);
		
		System.out.printf("[%d년 %02d월]\n",year,month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토");
		
		// 첫 번째 날짜 세팅
		int today = 1;

		for (int i = 0; i <= 42; i++) {
			// 시작일보다 첫 번째 날짜가 작으면
			if (i < startDay) {
				// 탭을 통하여 건너뛰기
				System.out.print("\t");
			} else {
				// 첫 번째 날짜가 시작일보다 크면 첫 번째 날짜로 세팅 
				System.out.printf("%02d\t", today);
				// 날짜 증가
				today++;
			}
			// 1주일이 지나면
			if (i % 7 == 0) {
				// 줄 건너뛰기
				System.out.println();
			}
			// 마지막 날짜보다 더 크면
			if (today > lastDay) {
				// 반복문 종료
				break;
			}
		}
	}
}