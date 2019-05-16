<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    <h2>The Library</h2>

    <c:out value="${singleValue}"/> <p/>

    A message: <c:out value="${message}"/> <p/>

    <c:if test="${number > 0}">
        <h3>
            We have number: <c:out value="${number}"/>
        </h3> <p/>
    </c:if>

    <c:choose>
        <c:when test="${test == 'true'}">
            test was true
        </c:when>
        <c:otherwise>
            test was false
        </c:otherwise>
    </c:choose>

    <c:forEach var="item" items="${info}">
        Out put: <c:out value="${item}"/> <p>
    </c:forEach>

    <form action="action">
        <input type="text" name="field1"/>
        <input type="submit"/>
    </form>

</body>
</html>