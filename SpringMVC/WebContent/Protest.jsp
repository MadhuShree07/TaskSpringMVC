<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="protest.do" method="post">
		<pre>
		Organization<input type="text" name="organization" />
		Message:<textarea rows="5" cols="30"></textarea>
		Date<input type="date" name="date" />
		<select type="location">
		<option value="mall">Mall</option>
		<option value="park">Park</option>	
		<option value="vidhanasoudha">Vidhanasoudha</option>		
		<option value="temple">temple</option>		
		
		</select>
		<input type="submit" value="Click me" />
		</pre>
	</form>

</body>
</html>