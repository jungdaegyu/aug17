<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script src="https://code.jquery.com/jquery-3.7.0.min.js"></script>
<script type="text/javascript">
// jQuery 코드 작성
$(function(){
	$("#joinjoin").click(function(){
		let mid = $("#mid").val();
		if (mid =="" || mid.length < 5) {
			alert("아이디를 5글자 이상 입력하세요");	
		}
		
		
	});
	return false;
});





</script>

</head>






<h1>회원가입 화면</h1>
<body>
<div class="join-div">
		<form action="./join" method="post">
		<h1>회원가입</h1>
		<hr>
		<div class="label-row">
			<div class="label-name">아이디</div>
			<div class="label-in">
				<input type="text" name="mid" id="mid">
			</div>
		</div>
		<div class="label-row">
			<div class="label-name">비밀번호</div>
			<div class="label-in">
				<input type="password" name="mpw">
			</div>
		</div>
			<div class="label-row" style="height: 40px" id="resultForm">
			<div class="label-name"></div>
			<div class="label-in"><span id="resultMSG"></span></div>
		</div>
		<div class="label-row">
			<div class="label-name">이 름</div>
			<div class="label-in">
				<input type="text" name="mname">
			</div>
		</div>
	
		<hr>
		<div class="label-row lrbtn">
			<button type="reset">취소</button>
			<button type="submit" id="joinjoin">가입하기</button>
		</div>
		</form>

		</div>
		<button id="click">Click Me</button>
</body>
</html>