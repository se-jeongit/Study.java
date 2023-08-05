import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Assignment7_Lotto {

	public static void main(String[] args) {
		// 로또 당첨 시뮬레이션 프로그램
		Scanner sc = new Scanner(System.in);
				
		System.out.println("[로또 당첨 프로그램]\n");
		
		System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~ 10):");
		int max = sc.nextInt();
		sc.close();
		
		// 구매한 로또 번호 저장 배열
		ArrayList<int[]> purchasedNum = new ArrayList<int[]>();
		
		// 로또 구매 개수만큼 반복하여 로또 번호 생성
		for (int i = 0; i < max; i++) {
			int[] randomNum = new int[6];
			
			// 로또 랜덤번호 생성 메소드
			createRandomNum(randomNum);
			
			System.out.print((char) ('A' + i) + "\t");
			
			// 로또 번호 정렬
			arraySort(randomNum);
			
			// 로또 배열에 저장
			purchasedNum.add(randomNum);
			
			// 생성된 로또 리턴
			arrayReturn(randomNum, "y");
		}
			
		System.out.print("\n[로또 발표]\n");
		
		int[] winningNum = new int[6];
		
		// 로또 랜덤번호 생성 메소드
		createRandomNum(winningNum);
		
		System.out.print("\t");
		
		// 로또 번호 정렬
		arraySort(winningNum);
		
		// 생성된 로또 리턴
		arrayReturn(winningNum, "y");
		
		System.out.print("\n[내 로또 결과]\n");
		
		// 로또 결과 리턴 반복문
		for (int i = 0; i < max; i++) {
			int check = 0;
			int[] randomNum = new int[6];
			
			for (int j = 0; j < randomNum.length; j++) {
				for (int k = 0; k < winningNum.length; k++) {
					randomNum = purchasedNum.get(i);
					if (randomNum[j] == winningNum[k])
						check++;
				}
			}
			System.out.print((char) ('A' + i) + "\t");
			// 생성된 로또 리턴
			arrayReturn(randomNum, "n");
			System.out.print(" => " + check + "개 일치\n");
		}
	}
	
	// 로또 랜덤번호 생성 메소드
	public static void createRandomNum(int[] array) {
		for (int i = 0; i < 6; i++) {
			Random rd = new Random();
			
			int rdNumber = rd.nextInt(45) + 1;
			
			for (int j = 0; j < 6; j++) {
				while (rdNumber == array[j]) {
					rdNumber = rd.nextInt(45) + 1;
				}
			}
			
			array[i] = rdNumber;
		}
	}
	
	// 로또 번호 정렬
	public static void arraySort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				int temporary = array[i];
				
				if (temporary < array[j]) {
					temporary = array[j];
					array[j] = array[i];
					array[i] = temporary;
				}
			}
		}
	}
	
	// 생성된 로또 리턴
	public static void arrayReturn(int[] array, String answer) {
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1)
				System.out.print(String.format("%02d", array[i]) + ", ");
			else
				System.out.print(String.format("%02d", array[i]));
		}
		if (!answer.equals("n"))
			System.out.println("");
	}
}