<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="politics.do" method="post">
<pre>
		NoOfCandidates:<input type="text" name="noOfCandidates" />
		ElectionDate<input type="date" name="date" />
		PartyNames<select type="partyNames">
		<option value="bjp">BJP</option>
		<option value="congress">Congress</option>	
		<option value="jds">JDS</option>		
		</select>
		<input type="submit" value="Click me" />
		</pre>
	</form>
</body>
</html>