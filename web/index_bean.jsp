<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <jsp:useBean id="ScreechBean" scope="session" class="main.java.beans.ScreechBean" />
    <jsp:setProperty name="ScreechBean" property="*" />
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <jsp:setProperty name="ScreechBean" property="title" value="Screech Bean"></jsp:setProperty>
    <title><jsp:getProperty name="ScreechBean" property="title"></jsp:getProperty></title>
</head>
<body>
<form method="post">
    <pre>
    <strong class="test">Calculate speed of your car from it's skid marks<br>
    </strong><br>
        Enter skid length:<br>
        <input type="text" name="skidLength"><br>
        Enter Number of skid marks:<br>
        <input type="text" name="skidMarks"><br>
        <label>Enter type of road surface:</label><br>
        <input type="radio" name="lang" value="Cement">Portland Cement<br>
        <input type="radio" name="lang" value="Asphalt">Asphalt<br>
        <input type="radio" name="lang" value="Gravel">Gravel<br>
        <input type="radio" name="lang" value="Ice">Ice<br>>
        <input type="radio" name="lang" value="Snow">Snow<br>
        <input type="submit" name="submit" type="submit" value="submit">
        The length of the skid is : <jsp:getProperty name="ScreechBean" property="skidLength" />
        The number of skid marks are : <jsp:getProperty name="ScreechBean" property="skidMarks" />
    </pre>
</form>
</body>
</html>