package tw.hibernatedemo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GoodPhotoSelectAllServlet")
public class GoodPhotoSelectAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodPhotoSelectAllServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//拿全部圖片
		
		//response header
		//注意 contentType
		//可能需要另一個 servlet幫忙
		
		//跳到Allphoto.jsp顯示
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
