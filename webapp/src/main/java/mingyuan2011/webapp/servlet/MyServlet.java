package mingyuan2011.webapp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet {

	private ServletConfig servletConfig;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.servletConfig = config;
		System.out.println("Servlet Name: " + servletConfig.getServletName());
		Enumeration<String> params = config.getInitParameterNames();
		while(params.hasMoreElements()){
			String param = params.nextElement();
			System.out.println(param + " : "+config.getInitParameter(param));
		}
	}

	@Override
	public ServletConfig getServletConfig() {
		return servletConfig;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head><title>MyServlet Demo</title></head>");
		out.println("<body>");
		out.println("<h1>Hello MyServlet Demo</h1");
		out.println("</body>");
		out.println("</html>");
		
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
