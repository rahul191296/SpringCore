<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>sql:query Tag</title>
</head>
<body>

	<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@localhost:1521:xe" user="system"
		password="root" />

	<sql:update dataSource="${db}" var="rs">  
	dalete from Products where Product_id=
</sql:update>

	<table border="2" width="100%">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>product category</th>
			<th>Product Price</th>
		</tr>
		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<td><c:out value="${table.Product_id}" /></td>
				<td><c:out value="${table.Name}" /></td>
				<td><c:out value="${table.Category}" /></td>
				<td><c:out value="${table.Price}" /></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>