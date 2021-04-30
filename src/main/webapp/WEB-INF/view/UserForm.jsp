<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>User page</title>
</head>

<style>
.error {
	color: red;
}
</style>

	<body>
		<div class="Form">
			<h2>User details :</h2>

			<form:form action="processUserForm" modelAttribute="tempuser">
	FirstName * : <form:input path="firstName" />
					<form:errors path="firstName" cssClass="error" />
			<br></br>
				
	LastName : <form:input path="lastName" />
			<br></br>
	
	Email * : <form:input path="email" />
				<form:errors path="email" cssClass="error" />
			<br></br>
	
	Country * : <form:select path="country">
					<form:option value="selected" disabled="true" selected="selected" />
						<form:options items="${tempuser.countryMap}" />
				<%-- another method for populating countries 
				<form:option value="BZ" label="Brazil" /> 
				<form:option value="US" label="United-States" /> 
				<form:option value="UK" label="United Kingdom" /> 
				<form:option value="SA" label="South Africa" />  --%>
				</form:select>
					<form:errors path="country" cssClass="error" />

			<br></br>
			
	Programming Language * :
						Java <form:radiobutton path="preferredLanguage" value="JAVA" />
							C# <form:radiobutton path="preferredLanguage" value="C#" />
							Python <form:radiobutton path="preferredLanguage" value="PYTHON" />
								Ruby <form:radiobutton path="preferredLanguage" value="RUBY" />
									.Net <form:radiobutton path="preferredLanguage" value=".NET" />
							 <form:errors path="preferredLanguage" cssClass="error" />
			
			<br></br>
						
	OperatingSystem * : Windows <form:checkbox path="operatingSystem" value="WINDOWS" />
					  		Mac-OS <form:checkbox path="operatingSystem" value="MAC OS" />
					  			Linux <form:checkbox path="operatingSystem" value="LINUX" />
								<form:errors path="operatingSystem" cssClass="error" />
			
			<br></br>
			
	Course Code : 			<form:input path="customCourseCode"/>
								<form:errors path="customCourseCode" cssClass="error"/>		

			<br></br> 
				  <input type="submit" value="save" />
				</form:form>
		
			<br></br> 
		
		<i>Field marked as (*) are mandatory</i>
		</div>
	</body>
</html>