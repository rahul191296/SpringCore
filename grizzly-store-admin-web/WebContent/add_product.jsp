<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Add Products</title>
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

<div class="mlef">
<img src="images/pic3.png" height="40" width="500px">

<!-- Change in Page Start Here -->
<form action="add" method="post">
<div class="mlef temp">
<button id="button2" type="button"><img  src="images/pic4.png" height="190" width="180px"></button>
</div>
<div >
<div class="temp">
<input class="borderRound1" type="text" name="Product_id" placeholder="Enter Product ID">
</div>

<select class="borderRound1" name="Category" >
<option>Category</option>
<option>Personal Care</option>
<option>Laptops</option>
<option>Art Supplies</option>
<option>Kids</option>
<option>Garments</option>

</select> 

<div>
<input class="borderRound1" type="text" name="Name" placeholder="Name">
</div>

<div>
<input class="borderRound1" type="text" name="Description" placeholder="Description">
</div>
<div>
<input class="borderRound1" type="text" name="Price" placeholder="price">
</div>
<div>
<input class="borderRound1" type="file" name="file" placeholder="brouse">
</div>
<div class="btnadd">
<input id="button3" type="submit" value="Add">
<br><br><a href="Home.jsp" ><button  id="button1" type="button">Cancel</button></a>
</div>
</div>
</form>
<!-- class="btnadd" -->

<!-- Change in Page End Here -->
</div>

</div>


</body>
</html>