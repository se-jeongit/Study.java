import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class SurpriseAssignment1_html {

	public static void main(String[] args) {
		StringBuilder html = new StringBuilder();
		
		html.append("<!DOCTYPE html>\n");
		html.append("<html lang=\"utf-8\">\n");
		html.append("<head>\n");
		html.append("<meta charset=\"UTF-8\">\n");
		html.append("<style>\n");
		html.append("table {border-collapse: collapse; width: 100%;}\n");
		html.append("th, td {border: solid 1px #000;}\n");
		html.append("</style>\n");
		html.append("</head>\n");
		html.append("<body>\n");
		html.append("<h1>자바 환경정보</h1>\n");
		html.append("<table>\n");
		html.append("<tr>\n");
		html.append("<th>키</th>\n");
		html.append("<th></th>\n");
		html.append("</tr>\n");

		for (Object k : System.getProperties().keySet()) {
			String key = k.toString();
			String value = System.getProperty(key);
			html.append("<tr>\n");
			html.append("<td>").append(key).append("</td>\n");
			html.append("<td>").append(value).append("</td>\n");
			html.append("</tr>\n");
		}

		html.append("</table>\n");
		html.append("</body>\n");
		html.append("</html>");

		try {
			// 사용자 경로에 실제 파일을 저장할 경로를 입력하세요.
			File file = new File("/사용자 경로/property.html");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write(html.toString());
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}