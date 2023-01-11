package tw.hibernatedemo.controller;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import tw.hibernatedemo.Service.GoodPhotoService;
import tw.hibernatedemo.Service.MemberService;
import tw.hibernatedemo.model.GoodPhoto;
import tw.hibernatedemo.model.Member;

@MultipartConfig
@WebServlet("/GoodPhotoUploadServlet")
public class GoodPhotoUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GoodPhotoUploadServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String photoname = request.getParameter("photoName");
		
//		System.out.println("photoName");
		//取得圖片
		Part filePart = request.getPart("file");
		InputStream in  = filePart.getInputStream();
		
		//圖片放入陣列
		byte[] bytes = in.readAllBytes();
		in.close();
		
		GoodPhoto gp = new GoodPhoto();
//		//圖片set名字
		gp.setPhotoName(photoname);
		gp.setPhotoFile(bytes);
		
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		GoodPhotoService gService = context.getBean("goodPhotoService",GoodPhotoService.class);
		gService.insertPhoto(gp);
		
		request.getRequestDispatcher("uploadsuccess.jsp").forward(request, response);
		
		
	}

}
