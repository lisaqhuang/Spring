<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Page</title>
</head>
<body>
<h1>圖片上傳</h1>
<form action="${pageContext.request.contextPath}/GoodPhotoUploadServlet" method="post" enctype="multipart/form-data">
    圖片名稱:<input type="text" name="photoName">
    <br>
    選擇檔案:<input type="file" name="file">
    <input type="submit" value="上傳圖片">
</form>


</body>
</html>