<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="bean.EmployeeBean"%>

<%
    EmployeeBean employeeBean = (EmployeeBean) request.getAttribute("EmployeeBean");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧</title>
</head>
<body>
	<div class="wrapper">
		<div class="header">header</div>
		<div class="main">
			<div class="title">
				<h1>ITEMS</h1>
				<h2>商品</h2>
			</div>
			<div class="items">
				<div class="firstrow">
					<c:forEach begin="1" end="3" var="i">
						<div class="item">
							<div class="image">
								<c:out value="${i.image}" />
							</div>
							<div class="name">
								<c:out value="${i.name}" />
							</div>
							<div class="price">
								<c:out value=¥ "${i.price}" />
							</div>
						</div>
					</c:forEach>
				</div>
				<div class="secondrow">
					<c:forEach begin="4" end="6" var="i">
						<div class="item">
							<div class="image">
								<c:out value="${i.image}" />
							</div>
							<div class="name">
								<c:out value="${i.name}" />
							</div>
							<div class="price">
								<c:out value=¥ "${i.price}" />
							</div>
						</div>
					</c:forEach>
				</div>
				<div class="thridrow">
					<c:forEach begin="7" end="9" var="i">
						<div class="item">
							<div class="image">
								<c:out value="${i.image}" />
							</div>
							<div class="name">
								<c:out value="${i.name}" />
							</div>
							<div class="price">
								<c:out value=¥ "${i.price}" />
							</div>
						</div>
					</c:forEach>
				</div>
				<div class="forthrow">
					<c:forEach begin="10" end="12" var="i">
						<div class="item">
							<div class="image">
								<c:out value="${i.image}" />
							</div>
							<div class="name">
								<c:out value="${i.name}" />
							</div>
							<div class="price">
								<c:out value=¥ "${i.price}" />
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
</body>
</html>