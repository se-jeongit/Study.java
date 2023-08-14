<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이파이 정보 구하기</title>
<style>
#wifiInfo {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#wifiInfo td, #wifiInfo th {
	border: 1px solid #ddd;
	padding: 8px;
}

#wifiInfo tr:hover {
	background-color: #ddd;
}

#wifiInfo th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: center;
	background-color: #04AA6D;
	color: white;
}
</style>
</head>
<body>
	<h1>와이파이 정보 구하기</h1>
	<div>
		<a href="index.jsp">홈</a> | <a href="history.jsp">위치 히스토리 목록</a> | <a
			href="load-wifi.jsp">Open API 와이파이 정보 가져오기</a> | <a
			href="bookmark-list.jsp">즐겨 찾기 보기</a> | <a href="bookmark-group.jsp">즐겨
			찾기 그룹 관리</a>
	</div>

	<div>
		<select>
			<option value="">북마크 그룹 이름 선택</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
		</select>

		<button>즐겨찾기 추가하기</button>
	</div>

	<table id="wifiInfo">
		<tr>
			<th>거리(Km)</th>
			<td>12.20310230</td>
		</tr>
		<tr>
			<th>관리번호</th>
			<td></td>
		</tr>
		<tr>
			<th>자치구</th>
			<td></td>
		</tr>
		<tr>
			<th>와이파이명</th>
			<td></td>
		</tr>
		<tr>
			<th>도로명주소</th>
			<td></td>
		</tr>

		<tr>
			<th>상세주소</th>
			<td></td>
		</tr>
		<tr>
			<th>설치위치(층)</th>
			<td></td>
		</tr>
		<tr>
			<th>설치유형</th>
			<td></td>
		</tr>
		<tr>
			<th>설치기관</th>
			<td></td>
		</tr>
		<tr>
			<th>서비스구분</th>
			<td></td>
		</tr>
		<tr>
			<th>망종류</th>
			<td></td>
		</tr>
		<tr>
			<th>설치년도</th>
			<td></td>
		</tr>
		<tr>
			<th>실내외구분</th>
			<td></td>
		</tr>
		<tr>
			<th>WIFI접속환경</th>
			<td></td>
		</tr>
		<tr>
			<th>X좌표</th>
			<td></td>
		</tr>
		<tr>
			<th>Y좌표</th>
			<td></td>
		</tr>
		<tr>
			<th>작업일자</th>
			<td></td>
		</tr>
	</table>
</body>
</html>