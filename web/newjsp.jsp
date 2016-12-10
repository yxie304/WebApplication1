<%-- 
    Document   : newjsp
    Created on : Dec 9, 2016, 6:45:09 PM
    Author     : yixxie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://gist.github.com/springmeyer/871897.js"></script>
        <script>
            var degrees2meters = function(lon,lat) {
        var x = lon * 20037508.34 / 180;
        var y = Math.log(Math.tan((90 + lat) * Math.PI / 360)) / (Math.PI / 180);
        y = y * 20037508.34 / 180;
        return [x, y]
}

x= -77.035974
y = 38.898717

console.log(degrees2meters(x,y))
</script>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
