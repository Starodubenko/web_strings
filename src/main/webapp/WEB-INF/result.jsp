<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ParsedText</title>
    <link href="main/res">
</head>
<body>
<div id="main">
    <div i>
        <p><h3>First paragraph</h3></p>
        <textarea name = "text" rows="30" cols="100" >${paragraph}</textarea>
    </div>
    <div>
        <p><h3>First sentence</h3></p>
        <textarea name = "text" rows="30" cols="100" >${sentence}</textarea>
    </div>
    <div>
        <p><h3>First word</h3></p>
        <textarea name = "text" rows="30" cols="100" >${word}</textarea>
    </div>
    <div>
        <p><h3>First symbol</h3></p>
        <textarea name = "text" rows="30" cols="100" >${charr}</textarea>
    </div>
</div>
</body>
</html>
