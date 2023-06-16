<!-- It is recommended not to use java code in index.jsp file -->
<!-- Instead, we should create a servlet to perform processes -->

<!-- 
Initially we were using xml based configuration : telusko-servlet.xml & web.xml
Then we replaced it by annotation based configuration : TeluskoConfig.java & MyWebInitializer.java
 -->

<html>
	<body>
		<form action="add">
			<!-- Here, by writing action = "add", when we click on submit button, it calls the "add" servlet -->
			<!-- First the request goes to web.xml, where all requests are mapped to dispatcher servlet-->
			<!-- Second, dispatcher servlet then refers to telusko-servlet.xml to find out which base package it must look through to find the controllers -->
			<!-- Third, while traversing through the methods in each controller, it looks for the method with url that matches the request in its @RequestMapping annotation -->
			<!-- In this case the request is "add" and the corresponding url is "/add", and it calls the "add" method -->
			<!--  -->
			
			<input type="text" name="t1"><br>
			<input type="text" name="t2"><br>
			<input type="submit"> 
				<!-- It automatically takes the name "submit", we don't need to mention a name -->
				<!-- When you click submit button, it will go to web.xml file, where it says for all requests, dispatcher servlet must be called -->
				<!-- Dispatcher servlet needs to convey the request to some class -->
		</form>
	</body>
</html>
