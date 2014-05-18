<%@ include file="/WEB-INF/views/include.jsp" %>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <h1><fmt:message key="heading"/></h1>    
    <h3>Office:		<c:out value="${model.office.description}"/></h3>
    
    <p>Local cost:		<i><c:out value="${model.office.localCost}"/>E</i></p>
    <p>Utilities cost:		<i><c:out value="${model.office.utilitiesCost}"/>E</i></p>
    <p>Employee cost:		<i><c:out value="${model.office.employeeCost}"/>E</i></p>
    <p>Total expenses:		<i><c:out value="${model.office.totalExpenses}"/>E</i></p>
   
    <br>
    <a href="<c:url value="costmodify.htm"/>">Modify Cost</a>
    <br>
  </body>
</html>