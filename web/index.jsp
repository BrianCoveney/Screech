<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<form method="post" action="ScreechServlet">
    <pre>
    <strong class="test">Calculate speed of your car from it's skid marks<br>
    </strong><br>
        Enter skid distance:<br>
        <input type="text" name="skidlength"><br>
        Enter Number of skid marks:<br>
        <input type="text" name="skidlength"><br>
        <label>Enter type of road surface:</label><br>
        <input type="radio" name="lang" value="Car">Protland Cement<br>
        <input type="radio" name="lang" value="Motorcycle">Asphalt<br>
        <input type="radio" name="lang" value="Motorcycle">Gravel<br>
        <input type="radio" name="lang" value="Motorcycle">Ice<br>
        <input type="radio" name="lang" value="Motorcycle">Ice<br>
        <input type="radio" name="lang" value="Motorcycle">Snow<br>
        <input type="submit" name="submit" type="submit" value="submit">
    </pre>
</form>
</body>
</html>