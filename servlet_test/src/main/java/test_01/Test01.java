package test_01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Test01 extends HttpServlet {

  private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
	  response.setContentType("text/html; charset=UTF-8");
    
    PrintWriter out = response.getWriter();
    
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    String tjd = request.getParameter("tjd");
    String todsus = request.getParameter("todsus");
    String dlswmdee = request.getParameter("dlswmdee");
    String mobile = request.getParameter("mobile");
    
    out.println("<ul type=\"disc\">");
    out.println("<li>아이디 : " + email + "</li>");
    out.println("<li>비밀번호 : " + password + "</li>");
    out.println("<li>이름 : " + name + "</li>");
    out.println("<li>생년월일 : +  + </li>");
    out.println("<li>성별 : " + tjd + "</li>");
    out.println("<li>이메일 : " + dlswmdee + "</li>");
    out.println("<li>휴대전화 : " + mobile + "</li>");
    out.println("<script>");
    out.println("</script>");
    out.flush();
    out.close();
	  
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
