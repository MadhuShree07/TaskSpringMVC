<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="country.do" method="post">
		<pre>
		Country name:<input type="text" name="countryName" />
		Population:<input type="text" name="population" />
		Continent<select type="continent">
		<option value="asia">Asia</option>
		<option value="africa">Africa</option>	
		<option value="southAmerica">SouthAmerica</option>		
		<option value="norththAmerica">NorthAmerica</option>		
		<option value="antartica">Antartica</option>
		</select>
		<input type="submit" value="Click me" />
		</pre>
	</form>

</body>
</html>