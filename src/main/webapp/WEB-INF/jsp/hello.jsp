<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
    <h2>The Library</h2>
    <Title>The Library</title>
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
    <table style="width:100%">
      <tr>
        <td>Author</td>
        <td>Book</td>
        <td>Pages</td>
      </tr>

      <c:forEach var="book" items"${books}">
         <tr>
                  <td><c: out"${book.getAuthor()}"/c></td>
                  <td><c: out"${book.getName()}"/c></td>
                  <td><c: out"${book.getPages()}"/c></td>
               </tr>
      </c:forEach>

    </table>

      <c: if test="${bookcount!=0}">

      </c: if>
</body>
</html>