<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이파이 정보 구하기</title>
<style>
#bookmarkInfo {
    font-family: Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#bookmarkInfo td, #bookmarkInfo th {
    border: 1px solid #ddd;
    padding: 8px;
    text-align: center;
}

#bookmarkInfo th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: #04AA6D;
    color: white;
}
</style>
</head>
<body>
    <h1>즐겨찾기 그룹 관리</h1>
    <div>
        <a href="index.jsp">홈</a> | <a href="history.jsp">위치 히스토리 목록</a> | <a
            href="load-wifi.jsp">Open API 와이파이 정보 가져오기</a> | <a
            href="bookmark-list.jsp">즐겨 찾기 보기</a> | <a href="bookmark-group.jsp">즐겨
            찾기 그룹 관리</a>
    </div>
    <br />

    <div>
        <button type="button" onclick="location.href='bookmark-group-add.jsp'">북마크
            그룹 이름 추가</button>
    </div>
    <br />

    <table id="bookmarkInfo">
        <tr>
            <th>ID</th>
            <th>북마크 이름</th>
            <th>순서</th>
            <th>등록일자</th>
            <th>수정일자</th>
            <th>비고</th>
        </tr>
        <tr>
            <td colspan="6">정보가 존재하지 않습니다.</td>
        </tr>
    </table>
</body>
</html>