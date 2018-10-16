package lesson03.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalculatorServlet extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(arg0.getParameter("a"));
		int b = Integer.parseInt(arg0.getParameter("b"));
		
		arg1.setContentType("text/plain");
		arg1.setCharacterEncoding("UTF-8");
		PrintWriter writer = arg1.getWriter();
		writer.println("a="+a+","+"b="+b);
		writer.println("a+b="+(a+b));
		writer.println("a-b="+(a-b));
		writer.println("a*b="+(a*b));
		writer.println("a/b="+(a/b));
		writer.println("a%b="+(a%b));
	}

}
