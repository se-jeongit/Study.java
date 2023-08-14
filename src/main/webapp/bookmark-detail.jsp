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
}

#bookmarkInfo tr:hover {
    background-color: #ddd;
}

#bookmarkInfo th {
    padding-top: 12px;
    padding-bottom: 12px;
    text-align: center;
    background-color: #04AA6D;
    color: white;
}

#buttonInfo {
    text-align: center;
}
</style>
</head>
<body>
    <h1>즐겨찾기 삭제</h1>
    <div>
        <a href="index.jsp">홈</a> | <a href="history.jsp">위치 히스토리 목록</a> | <a
            href="load-wifi.jsp">Open API 와이파이 정보 가져오기</a> | <a
            href="bookmark-list.jsp">즐겨 찾기 보기</a> | <a href="bookmark-group.jsp">즐겨
            찾기 그룹 관리</a>
    </div>
    <br />

    <div>북마크를 삭제하시겠습니까?</div>
    <br />

    <table id="bookmarkInfo">
        <tr>
            <th>북마크 이름</th>
            <td></td>
        </tr>
        <tr>
            <th>와이파이명</th>
            <td></td>
        </tr>
        <tr>
            <th>등록일자</th>
            <td></td>
        </tr>
    </table>
    <br />

    <div id="buttonInfo">
        <a href="bookmark-list.jsp">돌아가기</a> |
        <button>삭제</button>
    </div>
</body>
</html> 