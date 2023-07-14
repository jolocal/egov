<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table {
			width: 400px;
			border-collapse: collapse;
		}
		th, td {
			border: 1px solid #ccccc;
			padding: 5px;
		}
	</style>
</head>
<body>
		<table border="1">
			<tr>
				<th>사원번호</th>
				<td>${empDetail.empno}</td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td>${empDetail.ename}</td>
			</tr>
			<tr>
				<th>직업</th>
				<td>${empDetail.job}</td>
			</tr>
			<tr>
				<th>매니저</th>
				<td>${empDetail.mgr}</td>
			</tr>
			<tr>
				<th>입사일자</th>
				<td>${empDetail.hiredate}</td>
			</tr>
			<tr>
				<th>급여</th>
				<td>${empDetail.sal}</td>
			</tr>
			<tr>
				<th>커미션</th>
				<td>${empDetail.comm}</td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td>${empDetail.deptno}</td>
			<tr align="center">
				<td colspan="2">
					<button type="button" onclick="location.href='deleteEmp.do?empno=${empDetail.empno}'">삭제</button>
					<button type="button">수정</button>
				</td>
			</tr>
			
		</table>
</body>
</html>