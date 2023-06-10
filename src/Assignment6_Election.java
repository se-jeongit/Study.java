import java.util.Random;
import java.util.Scanner;

public class Assignment6_Election {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.printf("총 진행할 투표수를 입력해 주세요.");
		double votingParticipation = sc.nextInt();
		System.out.printf("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
		int numberOfCandidates = sc.nextInt();

		// 후보자를 저장할 배열 생성
		String[] listOfNominees = new String[numberOfCandidates];

		// 후보자의 득표수를 저장할 배열 생성
		int[] votes = new int[numberOfCandidates];

		// 후보자 배열에 후보자 이름을 입력받아 등록
		for (int i = 0; i < numberOfCandidates; i++) {
			System.out.printf((i + 1) + "번째 후보자 이름을 입력해 주세요.");
			String name = sc.next();
			listOfNominees[i] = name;
		}

		sc.close();
		System.out.println("");

		// 개표수
		double cnt = 1;

		// 랜덤값으로 후보자 투표 진행
		for (int i = 0; i < votingParticipation; i++) {

			int vote = rd.nextInt(numberOfCandidates);

			// 투표 진행률 체크
			System.out.printf("[투표진행률]: %.2f%%, %.0f명 투표 => %s\n", (cnt / votingParticipation) * 100, cnt,
					listOfNominees[vote]);
			votes[vote] += 1;

			// 득표 현황 체크
			for (int j = 0; j < numberOfCandidates; j++) {
				System.out.printf("[기호: %d] %s:\t%.2f%%\t(투표수: %d)\n", j + 1, listOfNominees[j],
						(((double) votes[j] / votingParticipation) * 100), votes[j]);
			}

			cnt++;
			System.out.println("");
		}

		int max = votes[0];
		int result = 0;

		// 최대 득표자 체크 로직
		for (int i = 0; i < numberOfCandidates; i++) {
			if (max < votes[i]) {
				max = votes[i];
				result = i;
			}
		}

		System.out.printf("[투표결과] 당선인 : %s", listOfNominees[result]);
	}
}