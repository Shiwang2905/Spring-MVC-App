<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<body>
	Hello ${tempuser.firstName}
	<br> Country : ${tempuser.country }

	<br>
	<h4>Preferred Language :</h4>
	${tempuser.preferredLanguage}
	<br>

	<h4>Operating System :</h4>
	<ol>
		<c:forEach var="os" items="${tempuser.operatingSystem }">
			<li>${os}</li>
		</c:forEach>
	</ol>
	Course : ${tempuser.customCourseCode}
	<p>welcome to the world of Spring MVC.</p>
</body>
</html>