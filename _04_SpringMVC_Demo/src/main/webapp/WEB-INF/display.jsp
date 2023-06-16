<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
		<!-- Make sure to set isELIgnored="false" if you want to use Expression Language, i.e., $ {label of data generated by controller} -->

<!-- 
The display.jsp file was moved from webapp folder into its subfolder WEB-INF
Now it is hidden, it becomes private, and it can't be accessed directly
-->

<!DOCTYPE html>

<html>

	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	
	<body>
		<!-- Result is : <%= request.getAttribute("result") %> -->
			<!-- Here we use "result", which is the label of the data returned by AddController, to refer to it -->
		
		Result is : ${result}
			<!-- Here we use Expression Language i.e., $ {label of data}, instead of <%= request.getAttribute("result") %> -->
	</body>
</html>