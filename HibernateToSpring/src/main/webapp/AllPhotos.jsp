<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>顯示頁面</title>
</head>
<body>


<div id="main">
		<table>
			<tr>
			    <td>圖片號碼</td>
				<td>圖片名稱</td>
				<td>圖片</td>
				
				<td colspan="2">加入購物車</td>
			</tr>		
            <!-- 上一個頁面 controller cc中GetAllProductForClient()中傳來listproduct -->
			<c:forEach items="${requestScope.listproduct}" var="product">
				<tr>
				    <td>${product.id}</td>
					<td>${product.productname}</td>
					<td>${product.productdate}</td>					
					<td><a href="/CampProject/CartServlet.do?id=${product.id}">加入購物車</a></td>					
				</tr>
			</c:forEach>

			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				
			</tr>	
		</table>
	</div>

</body>
</html>