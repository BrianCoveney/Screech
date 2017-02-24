<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <jsp:useBean id="ScreechBean" scope="session" class="main.java.beans.ScreechBean" />
    <jsp:setProperty name="ScreechBean" property="*" />
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

    <title>Screech</title>
</head>
<body>
<form method="get" action="ScreechServlet" method="post">
    <pre>
    <strong class="test">Calculate speed of your car from it's skid marks<br>
    </strong><br>

        Enter skid distance:<br>
        <input type="text" name="skidlength"><br>

        Enter Number of skid marks:<br>
        <input type="text" name="skidmark"><br>

        <label>Enter type of road surface:</label><br>
        <input type="radio" name="surface" value="Cement">Portland Cement<br>
        <input type="radio" name="surface" value="Asphalt">Asphalt<br>
        <input type="radio" name="surface" value="Gravel">Gravel<br>
        <input type="radio" name="surface" value="Ice">Ice<br>
        <input type="radio" name="surface" value="Snow">Snow<br>

        <input type="range" name="numInput" id="numInputId" value="24" min="1" max="100" oninput="numOutputId.value = numInputId.value">
        <output name="numOutputName" id="numOutputId">24</output>

        <input type="submit" name="submit" value="Submit"><br>
        <input type="reset" name="reset" value="Reset">

    </pre>
</form>


</body>
</html>