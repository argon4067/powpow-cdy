<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>마이홈 반려동물</title>
<link rel="stylesheet" href="../assets/css/main/main-index.css">
<link rel="stylesheet" href="../assets/css/myhome/myhome-pet-list.css">
<link rel="shortcut icon" href="../assets/images/favicon.ico">
</head>
<body>

		<!-- 헤더 -->
	<jsp:include page="../header.jsp"></jsp:include>
	<div class="sub h1">
		<p>반려동물 정보</p>
	</div>
	<button type="button" id="submit-button" onclick="location.href='./pet-kind.myhome'">+추가등록하기</button>

	 <c:if test="${empty pets}">
		<script>
			alert("펫을 등록해주세요");
			window.location.href = './no-pet.myhome';
		</script>
	</c:if> 
		<div id="mydog">
			<c:forEach items="${pets}" var="pet">
				<div class="card">
					<img class="star" src="../assets/images/myhome/star.svg"
						data-filled-src="../assets/images/myhome/star-select.svg"
						alt="선택된 동물">
							<div class="profile-pic" id="profilePic">
									<img id="profileImage" src="../assets/images/myhome/${pet.petImage}" alt="Profile Picture">
							</div>
							<div class="name">
									<c:out value="${pet.petName}" />
							</div>
					<div class="button-group">
						<a href="./pet-update.myhome?petId=${pet.id}"><button class="edit-button">편집</button></a>
						<a href="./pet-delete-ok.myhome?petId=${pet.id}"><button class="edit-button">삭제</button></a>
					</div>
				</div>
			</c:forEach>
		</div>
	<!-- 푸터 -->
	<jsp:include page="../footer.jsp"></jsp:include>
</body>
<script src="../assets/js/myhome/myhome-pet-list.js">
</script>
</html>