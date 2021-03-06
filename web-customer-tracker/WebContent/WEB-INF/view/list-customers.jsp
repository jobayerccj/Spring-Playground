<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>List Customers</title>
	<link 
			type="text/css" 
			rel="stylesheet" 
			href="${request.ContextPath}/resources/css/style.css" />
			
			<link href="<c:url value="/resources/css/add-customer-style.css" />" rel="stylesheet" />
			
			<link href="${pageContext.servletContext.contextPath}/resources/css/add-customer-style.css" rel="stylesheet"/>
			<link href="${pageContext.servletContext.contextPath}/resources/css/style.css" rel="stylesheet"/>
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
			<input type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'; return false;"
			class="add-button"/>
			
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<c:forEach var="tempCustomer" items="${customers}">
					<tr>
						<td>${ tempCustomer.firstName}</td>
						<td>${ tempCustomer.lastName }</td>
						<td>${ tempCustomer.email }</td>
					</tr>
				</c:forEach>
				
			</table>
		</div>
	</div>
</body>
</html>