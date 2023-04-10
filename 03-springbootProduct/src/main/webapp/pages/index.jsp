<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/">Add NewProduct</a>
<h3>Product Info</h3>
<!--$key used to access the value  -->
<p><font color="green">${msg} </font>
<form:form action="product"  modelAttribute="p" method="POST">
<table>
<tr>
<td>Name:</td>
<td><form:input path="name"/></td>
</tr>

<tr>
<td>Price:</td>
<td><form:input path="price"/></td>
</tr>

<tr>
<td>Quantity:</td>
<td><form:input path="qty"/></td>
</tr>

<tr>
<td><input type="submit" value="save"/></td>
</tr>

</table>
</form:form>
<!-- get request comming to url -->
<a href="products">View Products</a>

</body>
</html>