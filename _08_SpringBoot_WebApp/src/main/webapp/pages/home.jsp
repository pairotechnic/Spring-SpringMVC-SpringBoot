<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Hey there ${fullname} -->
	
	Hello there ${obj.aid}, ${obj.aname}, ${obj.lang}
<!--
		obj is the name of attribute in ModelAndView's Model
		The attribute is an object, alien, of Alien class which stored all the parameters passed by client
 		So, we are able to print each of those parameters as properties of obj, which is an alien object
 -->	
</body>
</html>