<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ParsedText</title>
    <link href="style/result.css" type="text/css" rel="stylesheet">
</head>
<body>
<div id="main">
    <div class="options">
        <form action="${pageContext.request.contextPath}/controller" method="post">
            <label for="paragraph">Paragraph</label>
            <input type="text" name="paragraph" id="paragraph" value="1" class="optionst">
            <label for="sentence">Sentence</label>
            <input type="text" name="sentence" id="sentence" value="1" class="optionst">
            <label for="word">Word</label>
            <input type="text" name="word" id="word" value="1" class="optionst">
            <label for="symbol">Symbol</label>
            <input type="text" name="symbol" id="symbol" value="1" class="optionst">
            <input type="hidden" name="text" value="${param.text}">
            <input type="submit" class="optionst" value="Show">
        </form>
    </div>
    <div class="areas">
        <p>

        <h3>Paragraph</h3></p>
        <textarea name="text" rows="30" cols="100">${paragraph}</textarea>
    </div>
    <div class="areas">
        <p>

        <h3>Sentence</h3></p>
        <textarea name="text" rows="30" cols="100">${sentence}</textarea>
    </div>
    <div class="areas">
        <p>

        <h3>Word</h3></p>
        <textarea name="text" rows="30" cols="100">${word}</textarea>
    </div>
    <div class="areas">
        <p>

        <h3>Symbol</h3></p>
        <textarea name="text" rows="30" cols="100">${charr}</textarea>
    </div>

    <div class="clear"></div>
</div>
</body>
</html>
