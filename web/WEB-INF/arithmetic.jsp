<%-- 
    Document   : arithmetic
    Created on : 31-May-2022, 6:36:03 PM
    Author     : Jimmy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First:</label>
            <input type="text" name="first" value="${first}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${second}">
            <br>
            <input type="submit" name="math" value="+">
            <input type="submit" name="math" value="-">
            <input type="submit" name="math" value="*">
            <input type="submit" name="math" value="%">
     
            <p>Result: ${result1}</p>
        </form>
         <a href="agecalculator">Age Calculator</a>
    </body>
</html>
