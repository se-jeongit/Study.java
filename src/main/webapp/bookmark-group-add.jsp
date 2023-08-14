<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="searchPublicWifi.DriverTest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이파이 정보 구하기</title>

<style>
#bookmarkAddInfo {
    font-family: Arial, Helvetica, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

#bookmarkAddInfo td, #bookmarkAddInfo th {
    border: 1px solid #ddd;
    padding: 8px;
}

#bookmarkAddInfo td:hover {
    background-color: #ddd;
}

#bookmarkAddInfo th:nth-child(odd) {
    padding-top: 12px;
    padding-bottom: 12px;
    background-color: #04AA6D;
    color: white;
    text-align: center;
}

#addButton {
    text-align: center;
}
</style>

</head>
<body>
    <h1>즐겨찾기 그룹 추가</h1>
    <div>
        <a href="index.jsp">홈</a> | <a href="history.jsp">위치 히스토리 목록</a> | <a
            href="load-wifi.jsp">Open API 와이파이 정보 가져오기</a> | <a
            href="bookmark-list.jsp">즐겨 찾기 보기</a> | <a href="bookmark-group.jsp">즐겨
            찾기 그룹 관리</a>
    </div>
    <br />

    <table id="bookmarkAddInfo">
        <tr>
            <th>북마크 이름</th>
            <td><input id="bookmarkName"></input></td>
        </tr>
        <tr>
            <th>순서</th>
            <td><input></input></td>
        </tr>
    </table>
    <br />

    <div id="addButton">
        <button id="button1" type="button" onclick="insertBookmarks()">추가</button>
    </div>
</body>
<script>
    function insertBookmarks() {
        Connection
        conn = DriverTest.getMySqlConnection();
        Statement
        stmt = conn.createStatement();

        String
        sql = "insert into bookmarks values (";
        var bookmarksName = document.getElementById("bookmarkName").getValue();
        console.log(bookmarksName, "bookmarksName ");
    }
</script>
</html>