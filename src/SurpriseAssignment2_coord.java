import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SurpriseAssignment2_coord {

	public static void main(String[] args) throws IOException {
		// 처음 입력한 경로와 가장 가까운 경로 찾기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("내 좌표 x값을 입력해 주세요.");
		int X = Integer.parseInt(br.readLine());
		System.out.println("내 좌표 y값을 입력해 주세요.");
		int Y = Integer.parseInt(br.readLine());
		Point XY = new Point(X, Y);

		// 10번 입력받아 가장 가까운 경로 찾기 위한 포인트 생성
		Point[] others = new Point[10];
		
		// 포인트 수만큼 반복
		for (int i = 0, iMax = others.length; i < iMax;) {
			System.out.println((i + 1) + "/10 번째 입력");

			System.out.println("임의의 좌표 x값을 입력해 주세요.");
			int x = Integer.parseInt(br.readLine());
			System.out.println("임의의 좌표 y값을 입력해 주세요.");
			int y = Integer.parseInt(br.readLine());

			// 입력받은 좌표가 처음 좌표와 동일한 좌표면 배제
			if (x == X && y == Y) {
				System.out.println("내 좌표와 동일합니다. 다시 입력해 주세요.");
				continue;
			}

			boolean exitsted = false;
			
			// 입력받은 좌표가 다른 좌표들 중 동일한 좌표면 배제
			for (int j = 0; j < i; j++) {
				if (x == others[j].x && y == others[j].y) {
					System.out.println("동일한 좌표값이 이미 존재합니다. 다시 입력해 주세요.");
					exitsted = true;
					break;
				}
			}

			if (exitsted)
				continue;

			others[i++] = new Point(x, y);
		}

		Point shortest = null;
		// 입력받은 좌표와 기준 좌표 거리 비교
		for (int i = 0, iMax = others.length; i < iMax; i++) {
			if (shortest == null || others[i].distance(XY) < shortest.distance(XY)) {
				shortest = others[i];
			}

			System.out.printf("(%d, %d) => %6f\n", others[i].x, others[i].y, others[i].distance(XY));
		}

		// 가장 가까운 좌표 노출
		System.out.println("제일 가까운 좌표:");
		System.out.printf("(%d, %d) => %6f\n", shortest.x, shortest.y, shortest.distance(XY));
	}

	// 포인트 생성 클래스
	static class Point {
		int x;
		int y;

		private double distance;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public double distance(Point point) {
			if (distance != 0)
				return distance;

			int diffX = Math.abs(point.x - x);
			int diffY = Math.abs(point.y - y);

			distance = Math.sqrt(diffX * diffX + diffY * diffY);
			return distance;
		}
	}
}