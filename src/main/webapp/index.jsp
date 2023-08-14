<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이파이 정보 구하기</title>
<style>

#publicWifi {
	font-family: Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#publicWifi td, #publicWifi th {
	border: 1px solid #ddd;
	padding: 8px;
}

#publicWifi tr:nth-child(even) {
	background-color: #f2f2f2;
}

#publicWifi tr:hover {
	background-color: #ddd;
}

#publicWifi th {
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
<br/>
	<div>
		LAT: <input type="text" id="latValue" placeholder="LAT 값을 입력하세요." readonly>,
        LNT: <input type="text" id="lntValue" placeholder="LNT 값을 입력하세요." readonly>

        <button id="myLocation" onclick="getLocation()">내 위치 가져오기</button>
        <button id="searchNearWifiInfo">근처 WIFI 정보 보기</button>
    </div> 
<br/>
	<table id="publicWifi">
		<tr>
			<th>거리(km)</th>
			<th>관리번호</th>
			<th>자치구</th>
			<th>와이파이명</th>
			<th>도로명주소</th>
			<th>상세주소</th>
			<th>설치위치(층)</th>
			<th>설치유형</th>
			<th>설치기관</th>
			<th>서비스구분</th>
			<th>망종류</th>
			<th>설치년도</th>
			<th>실내외구분</th>
			<th>WIFI접속환경</th>
			<th>X좌표</th>
			<th>Y좌표</th>
			<th>작업일자</th>
		</tr>
		<tr>
			<td colspan='17' style="text-align: center;">위치 정보를 입력한 후에 조회해 주세요.</td>
<!-- 			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td>
			<td></td> -->
		</tr>
	</table>

</body>
<script type="text/javascript">
    function getLocation() {
        if (navigator.geolocation) {
            navigator.geolocation.getCurrentPosition(function(position) {
                lat = position.coords.latitude;
                lot = position.coords.longitude;
                console.log(lat, lot);

                document.getElementById("latValue").value = lat;
                document.getElementById("lntValue").value = lot;
            }, function(error) {
                alert("error");
            }, {
                enableHighAccuracy : false,
                maximumAge : 0,
                timeout : Infinity
            });
        } else {
            alert('GPS를 지원하지 않습니다.');
        }
    }
</script>
</html>