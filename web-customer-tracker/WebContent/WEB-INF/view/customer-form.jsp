<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<title>Save Customer</title>
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
			<h2>CRM - Customer Add form</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<form:form action="saveCustomer" method="POST" modelAttribute="customer">
				<table>
					<tbody>
						<tr>
							<td><label> first name</label></td>
							<td><form:input path="firstName" /></td>
						</tr>
						
						<tr>
							<td><label> Last name</label></td>
							<td><form:input path="lastName" /></td>
						</tr>
						
						<tr>
							<td><label> Email</label></td>
							<td><form:input path="email" /></td>
						</tr>
						
						<tr>
							<td><label> </label></td>
							<td><input type="submit" value="Save" class="save"></td>
						</tr>
						
					</tbody>
				</table>
			
			</form:form>
			
			<p>
				<a href="${pageContext.request.contextPath}/customer/list"> Back to List</a>
			</p>
		</div>
	</div>
</body>
</html>