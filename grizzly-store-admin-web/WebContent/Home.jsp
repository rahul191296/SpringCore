<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home Page</title>
<link href="css\main.css" type="text/css" rel="stylesheet">
</head>
<body>

<div>
<ul>
  <li><img src="images/pic1.jpg" height="60px" width="700px"></li>
  <li><div id="DispName">Welcome, <%=session.getAttribute("userName") %></div></li>
  <li><div ><a href="LogoutServlet"><button id="button1" type="button">Logout</button></a></div></li>

</ul>
</div>
<div class="fram">
<div class="LeftFrame BkColr">
<div>
<img src="images/pic2.png" height="150" width="180px">
</div>
<div><center>
<%=session.getAttribute("userName") %>
</center>
</div>

</div>
<div class="LeftFrame">
<div>
<img src="images/pic3.png" height="40" width="500px">
</div>
<div>
<!-- Change in Page Start Here -->
<br>
<div ><a href="add_product.jsp"><button id="button1" type="button">Add Product</button></a></div><br>
<div ><a href="retrieve_product.jsp"><button id="button1" type="button">List Product</button></a></div>
<div ><a href="delete.jsp"><button id="button1" type="button">List Product</button></a></div>
<!-- Change in Page End Here -->
</div>
</div>
</div>


</body>
</html>