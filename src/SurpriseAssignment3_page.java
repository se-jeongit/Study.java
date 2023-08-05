public class SurpriseAssignment3_page {

	private final long totalCount;
	private final long pageSize = 10;
	private long pageIndex;

	public static void main(String[] args) {
		// 입력받은 페이지로 페이징 처리하기 
		long totalCount = 127;
		long pageIndex = 13;

		SurpriseAssignment3_page pager = new SurpriseAssignment3_page(totalCount);
		System.out.println(pager.html(pageIndex));
	}

	// 총 페이지 개수 체크
	public SurpriseAssignment3_page(long totalCount) {
		this.totalCount = totalCount;
	}

	// 페이징 처리 로직
	public String html(long pageIndex) {
		this.pageIndex = pageIndex;
		StringBuilder sb = new StringBuilder();
		sb.append("<a href='#'>[처음]</a>\n");
		sb.append("<a href='#'>[이전]</a>\n\n");

		// 첫 페이지
		int start = pageIndex <= 10 ? 1 : (int) (pageIndex / 10) * 10 + 1;
		// 마지막 페이지
		int last = start > ((totalCount / pageSize) + 1) - 9 ? (int) ((totalCount / pageSize) + 1) : start + 9;

		if (totalCount % 10 == 0)
			last--;
		if (pageIndex < 1) {
			sb.append("해당 페이지는 존제하지 않습니다.\n");
		}

		// 현재 페이지 체크 로직
		for (int i = start; i <= last; i++) {
			if (pageIndex == i) {
				sb.append("<a href='#' class='on'>").append(i).append("</a>\n");
			} else {
				sb.append("<a href='#'>").append(i).append("</a>\n");
			}
		}

		sb.append("\n<a href='#'>[다음]</a>\n");
		sb.append("<a href='#'>[마지막]</a>\n");

		return sb.toString();
	}
}